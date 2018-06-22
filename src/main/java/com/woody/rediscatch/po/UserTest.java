import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private String userName;
    private String age;
    private String salary;

    public User(String userName, String age, String salary) {
        this.userName = userName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) &&
                Objects.equals(age, user.age) &&
                Objects.equals(salary, user.salary);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userName, age, salary);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age='" + age + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getUserName() {
        return userName;
    }

    public String getAge() {
        return age;
    }

    public String getSalary() {
        return salary;
    }
}
