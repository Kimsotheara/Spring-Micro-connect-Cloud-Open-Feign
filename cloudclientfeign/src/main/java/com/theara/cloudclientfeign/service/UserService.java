package com.theara.cloudclientfeign.service;

import com.theara.cloudclientfeign.dto.DepartmentDto;
import com.theara.cloudclientfeign.dto.ResponseDto;
import com.theara.cloudclientfeign.dto.UserDto;
import com.theara.cloudclientfeign.entity.User;
import com.theara.cloudclientfeign.feignClient.ApiClient;
import com.theara.cloudclientfeign.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;
    private ApiClient apiClient;

    public ResponseDto findAll(Long userId){

        ResponseDto responseDto = new ResponseDto();
        User user = this.userRepository.findById(userId).get();
        UserDto userDto = mapToUser(user);
        Long departmentId = Long.parseLong(user.getDepartmentId());
        DepartmentDto departmentDto = apiClient.getDepartmentById(departmentId);
        responseDto.setUserDto(userDto);
        responseDto.setDepartmentDto(departmentDto);
        return responseDto;
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    private UserDto mapToUser(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }

}
