package am.aca.music.repository.Implementation;

import am.aca.music.repository.Interface.SongRepository;

/**
 * Created by Susanna.Aghlamazyan on 9/6/2016.
 */

import am.aca.music.comman.Model.Song;

import java.util.List;

public class SongRepositoryImpl {

    private static SongRepositoryImpl instance;
    private SongRepositoryImpl(){

    }
    public static SongRepositoryImpl getInstance(){
        if(instance == null){
            instance = new SongRepositoryImpl();
        }
        return instance;
    }

    public Song addSong(SongRepository song){
        //TODO
        return null;


    }
    public Song editSong(Song song){
        //TODO
        return null;
    }
    public void deleteSong(Integer songId){
        //TODO

    }
    public Song getSong(Song song){
        //TODO
        return null;
    }
    public List<Song> getSong(String songArtist){
        //TODO

        return null;

    }

}
