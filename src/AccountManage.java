import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class AccountManage implements UserService{
    //unique id name phone
    private Map<String,User> idMap = new LinkedHashMap<>();
    private Map<String,User> nameMap = new LinkedHashMap<>();
    private Map<String,User> phoneMap = new LinkedHashMap<>();

    /**
     * @param info user information
     */
    @Override
    public void add(User info) throws Exception{
        String id = info.getId();
        String name = info.getUsername();
        String phone = info.getPhone();
        if(id == null & name == null & phone == null) {
            throw new IOException("Value must not be empty");
        }
        if(!phone.substring(0,3).equals("+86")) {
            throw new IOException("Phone number has wrong country code");
        }
        idMap.put(id, info);
        nameMap.put(name, info);
        phoneMap.put(phone, info);
    }

    /**
     * @param info user information
     */
    @Override
    public void update(User info) throws Exception{
        String id = info.getId();
        String name = info.getUsername();
        String phone = info.getPhone();
        if(id == null & name == null & phone == null) {
            throw new IOException("Value must not be empty");
        }
        if(!phone.substring(0,3).equals("+86")) {
            throw new IOException("Phone number has wrong country code");
        }
        idMap.replace(id, info);
        nameMap.replace(name, info);
        phoneMap.replace(phone, info);
    }

    /**
     * @param id user id
     */
    @Override
    public void delete(String id) {
        User old = idMap.get(id);
        nameMap.remove(old.getUsername());
        phoneMap.remove(old.getPhone());
        idMap.remove(id);
    }

    /**
     * @param id user id
     * @return user obj
     */
    @Override
    public User searchId(String id) {
        return idMap.get(id);
    }

    /**
     * @param name username
     * @return
     */
    @Override
    public User searchName(String name) {
        return nameMap.get(name);
    }

    /**
     * @param phone
     * @return
     */
    @Override
    public User searchPhone(String phone) {
        return phoneMap.get(phone);
    }

    /**
     * @param id
     * @param password
     */
    @Override
    public void changePass(String id, String password) throws Exception{
        if(password == null){
            throw new IOException("Password is empty");
        }
        User user = idMap.get(id);
        user.setPassword(password);
        idMap.replace(id,user);
        nameMap.replace(user.getUsername(),user);
        phoneMap.replace(user.getPhone(),user);
    }

    /**
     * @param id
     * @param phone
     */
    @Override
    public void changePhone(String id, String phone) throws Exception{
        if(phone == null){
            throw new IOException("Password is empty");
        }
        if(!phone.substring(0,3).equals("+86")) {
            throw new IOException("Phone number has wrong country code");
        }
        User user = idMap.get(id);
        user.setPhone(phone);
        idMap.replace(id,user);
        nameMap.replace(user.getUsername(),user);
        phoneMap.replace(user.getPhone(),user);
    }
}