package kg.express.express;

public class RoleManager {
    public enum Role {
        ADMIN, REGISTRATOR
    }

    public static Role getRole(String username) {
        // здесь можно реализовать проверку роли пользователя
        // например, в зависимости от имени пользователя
        // или из базы данных
        if (username.equals("admin")) {
            return Role.ADMIN;
        } else {
            return Role.REGISTRATOR;
        }
    }

    public static boolean hasAdminAccess(String username) {
        return getRole(username) == Role.ADMIN;
    }
}
