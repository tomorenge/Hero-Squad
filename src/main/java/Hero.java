import java.util.ArrayList;
import java.util.List;

public class Hero {

    private String mName;
    private int mAge;
    private String mAbility;
    private String mWeakness;
    private static List<Hero> instances = new ArrayList<Hero>();
    private int mId;


    public Hero(String name, int age, String ability, String weakness) {
        mName = name;
        mAge = age;
        mAbility = ability;
        mWeakness = weakness;
        instances.add(this);
        mId = instances.size();
    }

    public String getName() {
        return mName;
    }

    public String getAbility() {
        return mAbility;
    }

    public int getAge() {
        return mAge;
    }

    public String getWeakness() {
        return mWeakness;
    }


    public static List<Hero> all() {
        return instances;
    }

    public static void clear() {
        instances.clear();
    }

    public static Hero find(int id) {
        return instances.get(id - 1);
    }

    public int getId() {
        return mId;
    }
}
