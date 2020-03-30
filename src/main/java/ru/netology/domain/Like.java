package ru.netology.domain;

public class Like {
    private int count;
    private boolean userLike;
    private boolean canLike;
    private boolean canPublish;

    public int getCounter() {
        return count;
    }

    public void setCounter(int count) {
        this.count = count;
    }

    public boolean isUserLike() {
        return userLike;
    }

    public void setUserLike(boolean userLike) {
        this.userLike = userLike;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}
