package gwc.com.recyclerviewdemo;

/**
 * Created by Eternity-Myth on 2017/11/17.
 */

public class Teams {
    private String name;
    private int imageId;

    public Teams(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
