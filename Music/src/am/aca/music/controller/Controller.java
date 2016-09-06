package am.aca.music.controller;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

import am.aca.music.comman.Model.PlayList;
import am.aca.music.comman.Model.User;
import am.aca.music.repository.Implementation.SongRepositoryImpl;
import am.aca.music.repository.Implementation.UserRepositoryImpl;
/**
 * Created by Susanna.Aghlamazyan on 9/6/2016.
 */
public class Controller {
    String FILE_DIR = System.getProperty("user.dir") + "\\Music\\Resources\\config.properties";
    Scanner sc = new Scanner(System.in);
    String inputValue;

    Properties property = new Properties();
    InputStream input = null;

    String tempUserName;
    String tempPassword;

    String tempSongTitle;
    String tempArtistName;

    static User currentUser;
    static Integer currentUserId;

    UserRepositoryImpl user = UserRepositoryImpl.getInstance();
    SongRepositoryImpl song = SongRepositoryImpl.getInstance();



    public void execute() {
        try {
            input = new FileInputStream(FILE_DIR);
            property.load(input);
            System.out.print(property.getProperty("command.signIn.signUp.ListenSong"));
            inputValue = sc.nextLine();

            while (inputValue != "SignOut") {

                switch (inputValue) {
                    case ("SignUp"):
                        signUp();
                        break;
                    case ("SignIn"):
                        signIn();
                        break;
                    case ("ListenSong"):
                        listenSong();
                        break;
                    case ("SignOut"):
                        signOut();
                        break;
                    case ("addToPlayList"):
                        addToPlayList();
                        break;
                    case ("ImportNewAlbum"):
                        importNewAlbum();
                        break;
                    default:
                        System.out.println(property.getProperty("wrong.command"));
                        System.out.print(property.getProperty("command.signIn.signUp.ListenSong"));
                        break;
                }
                inputValue = sc.nextLine();
            }

        } catch (Exception e) {
        }


    }

    public void signUp(){
        System.out.print(property.getProperty("command.provide.userName"));
        tempUserName = sc.nextLine();
        System.out.print(property.getProperty("command.provide.password"));
        tempPassword = sc.nextLine();
        User newUser = new User(tempUserName, tempPassword);
        user.addUser(newUser);
        System.out.print(property.getProperty("user.created.successfully"));
    }

    public void signIn(){
        System.out.print(property.getProperty("provide.userName"));
        tempUserName = sc.nextLine();
        System.out.print(property.getProperty("provide.password"));
        tempPassword = sc.nextLine();

        User userSignIn = new User(tempUserName, tempPassword);

        if ((user.getUser(userSignIn)) != null) {
            System.out.print(property.getProperty("user.logged.successfully"));
            currentUser = userSignIn;
            currentUserId = currentUser.getUserId();
            System.out.print(property.getProperty("command.listenMusic.AddPlayList.CreateAlbum"));


        } else {
            System.out.println(property.getProperty("wrong.user.username.password"));
            System.out.print(property.getProperty("command.signIn.signUp.ListenSong"));
            inputValue = sc.nextLine();
        }

    }

    public void listenSong(){
        System.out.print("command.songName.artistName");
        inputValue = sc.nextLine();

        if(inputValue == "SongArtist"){
            System.out.print("command.provide.artistName");
            tempArtistName = sc.nextLine();



        } else if (inputValue == "SongTitle") {
            System.out.print("command.provide.songTitle");
            tempSongTitle = sc.nextLine();

        }
    }

    public void signOut(){
        System.exit(0);
    }

    public void addToPlayList(){
       //TODO


    }

    public void importNewAlbum(){
        //TODO
    }





}
