package bpm_vvg_2015.procesiugovaranjaprikljucaka;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Ugovor implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "ugovor id")
   private java.lang.Integer ugovorId;
   @org.kie.api.definition.type.Label(value = "naziv ugovora")
   private java.lang.String nazivUgovora;
   @org.kie.api.definition.type.Label(value = "datum ugovora")
   private java.util.Date datumUgovora;
   @org.kie.api.definition.type.Label(value = "zahtjev")
   private bpm_vvg_2015.procesiugovaranjaprikljucaka.Zahtjev zahtjev;
   @org.kie.api.definition.type.Label(value = "placanje")
   private bpm_vvg_2015.procesiugovaranjaprikljucaka.Placanje placanje;
   @org.kie.api.definition.type.Label(value = "racun")
   private bpm_vvg_2015.procesiugovaranjaprikljucaka.Racun racun;

   public Ugovor()
   {
   }

   public java.lang.Integer getUgovorId()
   {
      return this.ugovorId;
   }

   public void setUgovorId(java.lang.Integer ugovorId)
   {
      this.ugovorId = ugovorId;
   }

   public java.lang.String getNazivUgovora()
   {
      return this.nazivUgovora;
   }

   public void setNazivUgovora(java.lang.String nazivUgovora)
   {
      this.nazivUgovora = nazivUgovora;
   }

   public java.util.Date getDatumUgovora()
   {
      return this.datumUgovora;
   }

   public void setDatumUgovora(java.util.Date datumUgovora)
   {
      this.datumUgovora = datumUgovora;
   }

   public bpm_vvg_2015.procesiugovaranjaprikljucaka.Zahtjev getZahtjev()
   {
      return this.zahtjev;
   }

   public void setZahtjev(
         bpm_vvg_2015.procesiugovaranjaprikljucaka.Zahtjev zahtjev)
   {
      this.zahtjev = zahtjev;
   }

   public bpm_vvg_2015.procesiugovaranjaprikljucaka.Placanje getPlacanje()
   {
      return this.placanje;
   }

   public void setPlacanje(
         bpm_vvg_2015.procesiugovaranjaprikljucaka.Placanje placanje)
   {
      this.placanje = placanje;
   }

   public bpm_vvg_2015.procesiugovaranjaprikljucaka.Racun getRacun()
   {
      return this.racun;
   }

   public void setRacun(bpm_vvg_2015.procesiugovaranjaprikljucaka.Racun racun)
   {
      this.racun = racun;
   }

   public Ugovor(java.lang.Integer ugovorId, java.lang.String nazivUgovora,
         java.util.Date datumUgovora,
         bpm_vvg_2015.procesiugovaranjaprikljucaka.Zahtjev zahtjev,
         bpm_vvg_2015.procesiugovaranjaprikljucaka.Placanje placanje,
         bpm_vvg_2015.procesiugovaranjaprikljucaka.Racun racun)
   {
      this.ugovorId = ugovorId;
      this.nazivUgovora = nazivUgovora;
      this.datumUgovora = datumUgovora;
      this.zahtjev = zahtjev;
      this.placanje = placanje;
      this.racun = racun;
   }

}