package com.cromxt.zenspaceserver.controller;


import com.cromxt.zenspaceserver.dtos.request.UpdatedUserData;
import com.cromxt.zenspaceserver.dtos.response.UserProfileResponse;
import com.cromxt.zenspaceserver.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public UserProfileResponse getUser(@RequestAttribute String userId) {
        userService.getUserById(userId);

        return null;
    }

    @PutMapping
    public UserProfileResponse updateUserProfile(@RequestBody UpdatedUserData updatedUserData){

        return null;
    }
}
