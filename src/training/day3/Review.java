package training.day3;

import java.util.Date;
import java.util.List;

public class Review {

    private float rating;
    private Customer user;
    private boolean isVerifiedPurchase;
    private String reviewDescription;
    private List<String> images;
    private Long reviewLikeCount;
    private Date reviewDate;

    private String responseFromStore;
    private long responseCount;

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Customer getUser() {
        return user;
    }

    public void setUser(Customer user) {
        this.user = user;
    }

    public boolean isVerifiedPurchase() {
        return isVerifiedPurchase;
    }

    public void setVerifiedPurchase(boolean verifiedPurchase) {
        isVerifiedPurchase = verifiedPurchase;
    }

    public String getReviewDescription() {
        return reviewDescription;
    }

    public void setReviewDescription(String reviewDescription) {
        this.reviewDescription = reviewDescription;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Long getReviewLikeCount() {
        return reviewLikeCount;
    }

    public void setReviewLikeCount(Long reviewLikeCount) {
        this.reviewLikeCount = reviewLikeCount;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getResponseFromStore() {
        return responseFromStore;
    }

    public void setResponseFromStore(String responseFromStore) {
        this.responseFromStore = responseFromStore;
    }

    public long getResponseCount() {
        return responseCount;
    }

    public void setResponseCount(long responseCount) {
        this.responseCount = responseCount;
    }
}
