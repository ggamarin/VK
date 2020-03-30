package ru.netology.domain;

public class Repost {
    private int count;
    private boolean userReposted;
    public int getCounter() {
        return count;
    }

    public void setCounter(int count) {
        this.count = count;
    }

    public boolean isUserReposted() {
        return userReposted;
    }

    public void setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;
    }
}
