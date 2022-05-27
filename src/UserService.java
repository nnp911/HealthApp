public interface UserService{
    /*
     * Create user account
     * @param take user obj store into some data structure
     */
    void create(User info);

    /*
     * edit user information
     * @param info
     */
    void update(User info);

    /*
     * delete by id
     * @param id
     */
    void delete(long id);

    /*
     * search by id
     * @param id
     * @return
     */
    User searchId(long id);

    /*
     * search by name
     * @param userName
     * @return user
     */
    User searchName(String name);

    /*
     * change password
     * @param username
     * @param Password
     */
    void changePass(String name, String password);

    /*
     * change phone number
     * @param username
     * @param phone num
     */
    void changePhone(String name, String phone);

}