public class Squad {
    private String mName;
    private int mMaxSize;
    private String mReason;

    public Squad(String name, int maxSize, String reason) {
        mName = name;
        mMaxSize = maxSize;
        mReason = reason;
//        instances.add(this);
    }
    public String getName(){
        return mName;
    }

    public int getMaximumSize() {
        return mMaxSize;
    }

    public String getReason() {
        return mReason;
    }

}
