package junglesweeper.gameobjects;

/**
 * Created by codecadet on 26/05/17.
 */
public enum GameObjectsType {

    ROCK(1, "./assets/pictures/rock.png" ),
    KEY(3, "./assets/pictures/key.png"),
    PATH(5, "./assets/pictures/path.jpeg"),
    DOOR(4, "./assets/pictures/door.png"),
    TIGER(2, "./assets/pictures/tiger.png");

    private int referenceInMap;
    private String imagePath;

    GameObjectsType(int referenceInMap, String imagePath) {
        this.referenceInMap = referenceInMap;
        this.imagePath = imagePath;
    }

    public String getImagePath(){
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public static GameObjectsType get(int referenceInMap){

        switch (referenceInMap){
            case 1:
                return ROCK;
            case 2:
                return TIGER;
            case 3:
                return KEY;
            case 4:
                return DOOR;
            default:
                System.out.println("Default GameObjectsType");
                return ROCK;
        }
    }
}
