public class Main {
    public static void main(String[] args) throws Exception {
        User user = new User("111111111111111111","+86 2333333333","hi","password");
        AccountManage m = new AccountManage();
        m.add(user);
        System.out.println(m.searchName("hi").getPhone());
    }
}