import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class SILab2Test {

    @Test
    public void everyBranchTest() {
        ArrayList<User> allUsers = new ArrayList<>();
        User exuser = new User("exuser", "expswrd!", "email@yahoo.com");
        allUsers.add(exuser);
        assertEquals(SILab2.function(new User("Name", "password?", "email@gmail.com"), allUsers),true); //tc1
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class,() -> SILab2.function(null, allUsers)); //tc2
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
        assertEquals(SILab2.function(exuser, allUsers),false); //tc3
        assertEquals(SILab2.function(new User(null,"pass word","emailgmail.com"), allUsers),false); //tc4
    }
    @Test
    public void multipleConditionsTest() {
        ArrayList<User> allUsers = new ArrayList<>();
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class,() -> SILab2.function(null, allUsers));    // T || X || X => user = null
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
        ex = assertThrows(RuntimeException.class,() -> SILab2.function(new User("name",null,null), allUsers));   // F || T || T user("name",null,null)
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
        ex = assertThrows(RuntimeException.class,() -> SILab2.function(new User("name","password?",null), allUsers));   // F || F || T user("name","password?",null)
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
        ex = assertThrows(RuntimeException.class,() -> SILab2.function(new User("name",null,"email@gmail.com"), allUsers));     // F || T || F user("name",null,"email@gmail.com")
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
        assertEquals(SILab2.function(new User("name","password?","email@gmail.com"), allUsers), true);      // F || F || F user("name","password?","email.gmail.com")
    }
}