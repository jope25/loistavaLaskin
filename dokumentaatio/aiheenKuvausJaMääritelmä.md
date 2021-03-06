#Aiheen kuvaus ja määritelmä

**Aihe:** Laskin, josta löytyy perustoiminnot (plus-, miinus-, kerto- ja jakolaskut) sekä vähän vaativampia laskutoimituksia, kuten potenssit ja neliöjuuret. Löytyy myös käpistelijöille suunnattua muuta toiminallisuutta, kuten binäärimuunnin. Ohjelmaa käytetään graafisen käyttöliittymän kautta.

**Käyttäjät:** Kuka vain

**Käyttäjien toiminnot:** 
* luvun syöttäminen
* Haluamansa toiminnon valitseminen. Niihin kuuluu:
  * perustoiminnot
  * vaativammat laskutoimitukset
    * potenssit
    * neliöjuuret
    * jne.
  * muuntimet
    * lukumuunnin
    * ASCII-muuntaja
* laskutoimituksen laskeminen
* tuloksen nollaus

##Luokkakaavio

![Kaavio](/dokumentaatio/Kaaviot/Luokkakaavio.JPG)

###Rakennekuvaus

Main:ssa luodaan Valintaikkuna, joka luo ValintaikkunaKuuntelijan. Valintaikkunan valintojen perusteella kuuntelija käynnistää joko Muunnin- , ASCIIMuuntaja- tai LaskinKayttoliittyman. Kaikki näistä luovat itselleen kuuntelijan, Muunnin sekä Laskin vielä näppäimet. Kuuntelijat ovat yhteydessä joko Laskin-, ASCIIMuuntaja- tai Binäärimuunnin- ja Heksadesimaalimuunnin-luokaan.

##Sekvenssikaaviot

###Laskimen käyttö

![Kaavio](/dokumentaatio/Kaaviot/LaskimenKaytto.JPG)

###Toiminnon valinta

![Kaavio](/dokumentaatio/Kaaviot/ToiminnonValinta.JPG)

