package imie.angers.fr.beaconstoreproject.metiers;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Anne on 20/02/2016.
 */
public class BeaconMetier {

    private int idBeacon;
    private String uuidBeacon;
    private String majorBeacon;
    private String minorBeacon;
    private String idMagasin;
    private String idsBeacon;
    private long idPromo;
    private Date dateBeacon;

    public String getUuidBeacon() {
        return uuidBeacon;
    }

    public void setUuidBeacon(String uuidBeacon) {
        this.uuidBeacon = uuidBeacon;
    }

    public String getMajorBeacon() {
        return majorBeacon;
    }

    public void setMajorBeacon(String majorBeacon) {
        this.majorBeacon = majorBeacon;
    }

    public String getMinorBeacon() {
        return minorBeacon;
    }

    public void setMinorBeacon(String minorBeacon) {
        this.minorBeacon = minorBeacon;
    }

    public String getIdMagasin() {
        return idMagasin;
    }

    public void setIdMagasin(String idMagasin) {
        this.idMagasin = idMagasin;
    }

    public long getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(long idPromo) {
        this.idPromo = idPromo;
    }

    public String getIdsBeacon() {
        return idsBeacon;
    }

    public void setIdsBeacon(String idsBeacon) {
        this.idsBeacon = idsBeacon;
    }

    public int getIdBeacon() {
        return idBeacon;
    }

    public void setIdBeacon(int idBeacon) {
        this.idBeacon = idBeacon;
    }

    public Date getDateBeacon() {
        return dateBeacon;
    }

    public void setDateBeacon(Date dateBeacon) {
        this.dateBeacon = dateBeacon;
    }
}
