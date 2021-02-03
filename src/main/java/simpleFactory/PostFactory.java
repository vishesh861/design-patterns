package simpleFactory;

public class PostFactory {

    public static Post createPost(String type) {
        switch (type) {
            case "product" :
                return new ProductPost();
            default:
                throw new IllegalArgumentException("Post type is unown");
        }
    }
}
