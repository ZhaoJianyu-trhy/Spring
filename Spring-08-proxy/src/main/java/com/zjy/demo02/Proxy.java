package com.zjy.demo02;

public class Proxy implements UserService {

    UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void Create() {
        log("Create");
        userService.Create();
    }

    public void Retrieve() {
        log("Retrieve");
        userService.Retrieve();
    }

    public void Update() {
        log("Update");
        userService.Update();
    }

    public void Delete() {
        log("Delete");
        userService.Delete();
    }

    //加一个日志方法
    private void log(String msg) {
        System.out.println("使用了" + msg + "方法");
    }
}
