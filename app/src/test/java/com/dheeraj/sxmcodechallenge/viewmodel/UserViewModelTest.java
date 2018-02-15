package com.dheeraj.sxmcodechallenge.viewmodel;

import com.dheeraj.sxmcodechallenge.model.User;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dheeraj Vaddepally on 2/14/2018.
 */
public class UserViewModelTest {

    @Test
    public void getEmailError() throws Exception {
        UserViewModel viewModel = new UserViewModel(new User("Email", "Password"));
        Assert.assertEquals("Please enter your email address.", viewModel.getEmailError());

        viewModel.setEmail("dheeraj@gmail.com");
        Assert.assertNull(viewModel.getEmailError());
    }

    @Test
    public void getPasswordError() throws Exception {
        UserViewModel viewModel = new UserViewModel(new User("Email", "Password"));
        Assert.assertEquals("Please enter your password.", viewModel.getPasswordError());

        viewModel.setEmail("Welcome123");
        Assert.assertNull(viewModel.getPasswordError());
    }

}