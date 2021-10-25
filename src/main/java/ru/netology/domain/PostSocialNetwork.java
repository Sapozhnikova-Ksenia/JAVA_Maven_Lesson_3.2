package ru.netology.domain;

public class PostSocialNetwork {
    private boolean canAddedPost;
    private boolean canDeletePost;
    private String idPost;
    private String postType;
    private String idOwnerPage;
    private String idAuthorPost;
    private String namePostingCompany;
    private String urlOfPostingCompany;
    private String namePost;
    private int datePost;
    private int timePost;
    private String textPost;
    private String urlPicture;
    private String urlVideo;
    private String urlBodyPost;
    private int viewCounter;
    private String urlPictureAvatarAuthorPost;

    private LikesPost likesPost;
    private MarkPost markPost;
    private CommentsPost commentsPost;
    private Geolocation geolocation;
    private Place place;
    //+getters/setters
}
