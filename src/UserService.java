public interface UserService{
    /**
     * Create user account
     * @param info take user obj store into some data structure
     */
    void create(User info);

    /**
     * edit user information
     * @param info
     */
    void update(User info);

    /**
     * delete by id
     * @param id
     */
    void delete(String id);

    /**
     * search by id
     * @param id
     * @return
     */
    User searchId(String id);

    /**
     * search by name
     * @param name
     * @return user
     */
    User searchName(String name);

    /**
     * change password
     * @param name
     * @param password
     */
    void changePass(String name, String password);

    /**
     * change phone number
     * @param name
     * @param phone num
     */
    void changePhone(String name, String phone);

}