package com.tj.designpatterns.chofresb.model;

/**
 * @author nitianyi
 * @date 2021/2/5
 */
public class HandlerRequest {

    private String trackingId;
    private UserRole userRole;
    private String userId;

    public HandlerRequest() {
    }

    public HandlerRequest(UserRole userRole) {
        this.userRole = userRole;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "HandlerRequest{" +
                "trackingId='" + trackingId + '\'' +
                ", userRole=" + userRole +
                ", userId='" + userId + '\'' +
                '}';
    }
}
