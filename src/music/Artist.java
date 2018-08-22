package music;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
@XmlRootElement( name = "artist" )
public class Artist {
	private int artistId;
	private String name;
	/*Los metodos tipo getAtributo
	* se convertian en
	* elementos del XML*/
	@XmlElement
	public int getArtistId() {
	return artistId;
	}
	public void setArtistId(int artistId) {
	this.artistId = artistId;
	}
	@XmlElement
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
}
