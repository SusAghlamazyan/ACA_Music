package am.aca.music.comman.Model;

import java.util.List;

/**
 * Created by Susanna.Aghlamazyan on 9/6/2016.
 */
public class PlayList {

    private List<Song> listOfSongs;
    private String name;
    public PlayList(List<Song> listOfSongs, String name) {
        this.listOfSongs = listOfSongs;
        this.name = name;
    }
    public List<Song> getList() {
        return listOfSongs;
    }
    public void setList(List<Song> listOfSongs) {
        this.listOfSongs = listOfSongs;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
