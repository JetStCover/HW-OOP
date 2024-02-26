package re.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Ivan";
        post.passport = "4444 № 4444444444";
        post.phone = "+7(999)-999-99-99";
        post.patronymic = "Ivanovich";
        post.surname = "Ivanov";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

    }

}