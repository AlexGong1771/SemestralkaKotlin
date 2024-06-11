package com.example.semestralka

object Question {
    val otazky = arrayOf(
        //Koľko B spolu definujú nasledujúce direktívy? DB ´Chyba!$´ DW 5 dup (0) DD 1.0		21
        //Koľko B spolu def. nasl. direktívy? DB ´Chyba!´ , 0 DW 4 dup (0) DD 10.0, 11.0, 12.0		27
        //Koľko čísiel so zn. možno zobraziť v jednom B? (v desiatkovej sústave)				256
        //Aké najmenšie celé č. so zn. možno zobraziť v jednom B? (v desiatkovej sústave)		-128
        //Aké najväčšie celé č. so zn. možno zobraziť v jednom B? (v desiatkovej sústave)			127
        //Aký je najmenší počet B, v kt. môže byť uložené č. v pohyblivej rádovej čiarke podľa IEEE?	4
        //Koľko B leží medzi adresami 4567:0100 a 4576:0010 (vrátane prvej a poslednej adresy)?	1h
        //Koľko B leží medzi adresami 3010:0100 a 3120:0010 (vrátane prvej a poslednej adresy)?	1011h
        //Koľko bajtov leží medzi adresami 7010:0100 a 7100:0010 vrátane?				E11h
        //Ktorá z nasledujúcich adries v tvare segment: offset reprezentuje najvyššiu fyz. adresu?		74D5:0300
        //Ktorá z nasledujúcich adries v tvare segment: offset reprezentuje najvyššiu fyz. adresu?		EED5:0300
        //Ktorá z nasledujúcich adries v tvare segment: offset reprezentuje najvyššiu fyz. adresu?		ABC4:0300
        "Koľko B spolu definujú nasledujúce direktívy? DB ´Chyba!´ DW 5 dup (0) DD 1.0",
        "Koľko B spolu def. nasl. direktívy? DB ´Chyba!´ , 0 DW 4 dup (0) DD 10.0, 11.0, 12.0",
        "Koľko čísiel so zn. možno zobraziť v jednom B? (v desiatkovej sústave)",
        "Aké najmenšie celé č. so zn. možno zobraziť v jednom B? (v desiatkovej sústave)",
        "Aké najväčšie celé č. so zn. možno zobraziť v jednom B? (v desiatkovej sústave)",
        "Aký je najmenší počet B, v kt. môže byť uložené č. v pohyblivej rádovej čiarke podľa IEEE?",
        "Koľko B leží medzi adresami 4567:0100 a 4576:0010 (vrátane prvej a poslednej adresy)?",
        "Koľko B leží medzi adresami 3010:0100 a 3120:0010 (vrátane prvej a poslednej adresy)?",
        "Koľko bajtov leží medzi adresami 7010:0100 a 7100:0010 vrátane?",
        "Ktorá z nasledujúcich adries v tvare segment: offset reprezentuje najvyššiu fyz. adresu?",
        "Ktorá z nasledujúcich adries v tvare segment: offset reprezentuje najvyššiu fyz. adresu?",
        "Ktorá z nasledujúcich adries v tvare segment: offset reprezentuje najvyššiu fyz. adresu?"
    )

    val vyber = arrayOf(
        arrayOf("21","22","23","24"),
        arrayOf("27", "13", "127", "22"),
        arrayOf("256", "255", "258", "396"),
        arrayOf("0", "-128", "-127", "-133"),
        arrayOf("127","128","0","2"),
        arrayOf("1","2","3","4"),
        arrayOf("1h","1ah","0","neni ziadna odpoved"),
        arrayOf("1h","1011h","0","neni ziadna odpoved"),
        arrayOf("E11h","E12h","0","neni ziadna odpoved"),
        arrayOf(" 74D5:0300","E12h","0","neni ziadna odpoved"),
        arrayOf(" E12h","EED5:0300","0","neni ziadna odpoved"),
        arrayOf(" E12h","0","ABC4:0300","neni ziadna odpoved")
    )

    val spravneOdpovede = arrayOf(
        "21",
        "27",
        "256",
        "-128",
        "127",
        "4",
        "1h",
        "1011h",
        "E11h",
        "74D5:0300",
        "EED5:0300",
        "ABC4:0300"

    )
}