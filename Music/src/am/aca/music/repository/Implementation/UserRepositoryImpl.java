package am.aca.music.repository.Implementation;

import am.aca.music.comman.Model.User;
import am.aca.music.repository.Interface.UserRepository;

/**
 * Created by Susanna.Aghlamazyan on 9/6/2016.
 */
public class UserRepositoryImpl implements UserRepository {

    private static UserRepositoryImpl instance;

    public static UserRepositoryImpl getInstance(){
        if(instance == null){
            instance = new UserRepositoryImpl();
        }
        return instance;
    }

    private UserRepositoryImpl(){

    }




    public User addUser(User user){
        //TODO
        return null;
    }
    public User editUser(User user){
        //TODO
        return null;
    }
    public void deleteUser(Integer id){
        //TODO

    }
    public Integer getUser(User user){
        //TODO
        return null;

    }

}
