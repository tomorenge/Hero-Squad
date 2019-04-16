import java.util.ArrayList;
import java.util.List;

public class Squad {
    private String mName;
    private int mMaxSize;
    private String mReason;
    private static List<Squad> instances = new ArrayList<Squad>();
    private int mId;
    private List<Hero> mHeros;


    public Squad(String name, int maxSize, String reason) {
        mName = name;
        mMaxSize = maxSize;
        mReason = reason;
        instances.add(this);
        mId = instances.size();
        mHeros = new ArrayList<Hero>();


    }

    public static List<Squad> all() {
        return instances;
    }

    public int getMaximumSize() {
        return mMaxSize;
    }

    public String getReason() {
        return mReason;
    }

    public static void clear() {
        instances.clear();
    }

    public static Squad find(int id) {
        try {
            return instances.get(id - 0);
        } catch (IndexOutOfBoundsException exception) {
            return null;
        }


    }

    public String getName() {
        return mName;
    }

    public int getId() {
        return mId;
    }

    public List<Hero> getHeroes() {
        return mHeros;
    }

    public void addHero(Hero newHero) {
    }
}

