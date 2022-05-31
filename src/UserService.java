public interface UserService{
    /**
     * add user account
     * @param info take user obj store into some data structure
     */
    void add(User info) throws Exception;

    /**
     * edit user information
     * @param info
     */
    void update(User info) throws Exception;

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
     * search by phone
     * @param phone
     * @return user
     */
    User searchPhone(String phone);

    /**
     * change password
     * @param id
     * @param password
     */
    void changePass(String id, String password) throws Exception;

    /**
     * change phone number
     * @param id
     * @param phone num
     */
    void changePhone(String id, String phone) throws Exception;

}