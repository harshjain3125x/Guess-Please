
import java.time.Duration;
import java.time.LocalTime;
import java.util.Random;
import javax.swing.*;

public class GuessPlease {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/guessing";
        String username = "root";
        String password = "5202";
        LocalTime t1 = LocalTime.now();
        String user;
        int pass, nan = 1;
        /*user = JOptionPane.showInputDialog("Enter your Username");
        pass = Integer.parseInt(JOptionPane.showInputDialog("Set  Password"));
        try (Connection connection = DriverManager.getConnection(url, username, password); PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO levelz(username,password,level) VALUES(?,?,?)")) {

            preparedStatement.setString(1, user);
            preparedStatement.setInt(2, pass);
            preparedStatement.setInt(3, 1);
            int rowsAffected = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "row inserted Succesfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        user = JOptionPane.showInputDialog("Enter your username");
        pass = Integer.parseInt(JOptionPane.showInputDialog("Enter your password"));*/
        Random rand = new Random();
        JOptionPane.showMessageDialog(null, "Welcome to coding duniya");
        int a = rand.nextInt(100);
        int b = Integer.parseInt(JOptionPane.showInputDialog("Guess a number"));
        if (b > a) {
            JOptionPane.showMessageDialog(null, "Lower number please!!");
        }
        if (a > b) {
            JOptionPane.showMessageDialog(null, "Higher number Please!!");

        }
        while (b != a) {
            b = Integer.parseInt(JOptionPane.showInputDialog("Guess a number Correctly!!"));
            if (b > a) {
                JOptionPane.showMessageDialog(null, "Lower number please!!");
            }
            if (a > b) {
                JOptionPane.showMessageDialog(null, "Higher number Please!!");

            }
            nan++;
        }
        LocalTime t2 = LocalTime.now();
        Duration t3 = Duration.between(t1, t2);
        JOptionPane.showMessageDialog(null, "Answered correctly after " + nan + " attempts\n" + "Time Taken    " + t3);
    }
}
