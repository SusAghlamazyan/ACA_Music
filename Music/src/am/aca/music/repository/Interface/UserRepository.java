package am.aca.music.repository.Interface;

/**
 * Created by Susanna.Aghlamazyan on 9/6/2016.
 */
import am.aca.music.comman.Model.User;
public interface UserRepository {

    public User addUser(User user);
    public User editUser(User user);
    public void deleteUser(Integer id);
    public Integer getUser(User user);

}
