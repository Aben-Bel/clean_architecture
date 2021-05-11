package com.abeni.main;
import com.abeni.controller.HelloController;
import com.abeni.controller.HelloControllerImpl;
import com.abeni.entity.gateway.DatabaseMock;
import com.abeni.entity.gateway.HelloGateway;
import com.abeni.entity.gateway.UserGateway;
import com.abeni.interactor.HelloBoundary;
import com.abeni.interactor.HelloInteractor;
import com.abeni.interactor.UserBoundary;
import com.abeni.interactor.UserInteractor;
import com.abeni.persenter.HomePresenter;
import com.abeni.persenter.HomeView;

public class Application {

    public static void main(String[] args) {
        System.out.println("Welcome to the application");
        HelloGateway gateway = new DatabaseMock();
        UserGateway userGateway = (UserGateway) gateway;
        HelloBoundary helloBoundary = new HelloInteractor(gateway);
        UserBoundary userBoundary = new UserInteractor(userGateway);
        
        HelloController homeController = new HelloControllerImpl(helloBoundary, userBoundary);
        HomeView view = new HomePresenter(homeController);
        
        while(true){
             view.getHome();
        }
    }
}
