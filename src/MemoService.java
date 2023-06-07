public interface MemoService {
    void getMemoList();

    void saveMemo(String name, int password, String post);

    void editMemo(int id, int password, String newPost);

    void showMemoList();

    void delMemo(int id, int password);

    void postMemo(String name, int password, String post);

}
