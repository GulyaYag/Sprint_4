package ru.yandex.praktikum;
import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import io.qameta.allure.junit4.DisplayName;

@RunWith(Parameterized.class)
public class AccountTests {
    private final String nameText;
    private final boolean result;
    Account name;

    public AccountTests(String nameText, boolean result) {
        this.nameText = nameText;
        this.result = result;
    }
    @Parameterized.Parameters (name = "index: {0} {1}")
    public static Object[][] getAccountData() {
        return new Object[][]{
                {"Имя Фамилия", true},
                {"ИмяФамилия", false},
                {" ИмяФамилия", false},
                {"ИмяФамилия ", false},
                {"Имя  Фамилия", false},
                {"И ", false},
                {"Имяяяя Фамилияяяяяяя", false},
                {"Имяяяя Фамилия Имя", false},
                {"", false},
                {null, false},
        };
    }

    @DisplayName("Validation of data")
    @Description("Checking the first and last name for compliance with the requirements")
    @Test
    public void checkName() {
        Account account = new Account(nameText);
        boolean actual = account.checkNameToEmboss(nameText);
        Assert.assertEquals(result, actual);
    }
    @DisplayName("Validation of exception")
    @Description("Checking exception")
    @Test (expected = NullPointerException.class)
    public void NullTrowsException() throws NullPointerException {
        name.validate();
    }
}


