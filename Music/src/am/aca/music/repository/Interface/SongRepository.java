package am.aca.music.repository.Interface;

/**
 * Created by Susanna.Aghlamazyan on 9/6/2016.
 */
import am.aca.music.comman.Model.Song;

import java.util.List;

public interface SongRepository {

    public Song addSong(Song song);
    public Song editSong(Song song);
    public void deleteSong(Integer songId);
    public Song getSong(Song song);
    public List<Song> getSong(String songArtist);

}
