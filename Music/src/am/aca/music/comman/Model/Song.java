package am.aca.music.comman.Model;

import am.aca.music.comman.Exception.InvalidInputException;

/**
 * Created by Susanna.Aghlamazyan on 9/6/2016.
 */

//This bean define information for Songs, which inserted by Admin/ Moderator
public class Song {
    private String songTitle;
    private String songArtist;
    private String songGenre;
    private Integer songId;


    public void setSongTitle(String songTitle) throws InvalidInputException {
        if(songTitle != null && !songTitle.isEmpty()){
            this.songTitle = songTitle;
        } else{

        }
    }

    public void setSongArtist(String songArtist) throws InvalidInputException{
        if(songArtist != null && !songArtist.isEmpty()){
            this.songArtist = songArtist;
        } else {
            throw new InvalidInputException("You have entered wrong Artist Name");
        }
    }

    public void setSongGenre(String genre) throws InvalidInputException{
        if(songGenre != null && !songGenre.isEmpty()){
            this.songGenre = songGenre;
        } else{
            throw new InvalidInputException("You have entered wrong SongRepository genre");
        }
    }

    public String getSongName() {
        return songTitle;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public Song(String songTitle, String songArtist){
        this.setSongTitle(songTitle);
        this.setSongArtist(songArtist);
    }
    public Song(String songArtist){
        this.setSongArtist(songArtist);
    }


}
