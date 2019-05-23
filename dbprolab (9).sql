SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;


CREATE TABLE `hammadde` (
  `ID` int(11) NOT NULL,
  `isim` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `hammadde` (`ID`, `isim`) VALUES
(1, 'H'),
(2, 'N'),
(3, 'C'),
(4, 'O'),
(5, 'S'),
(6, 'Cl');

CREATE TABLE `musteri` (
  `ID` int(11) NOT NULL,
  `musteriAdi` varchar(20) NOT NULL,
  `adres` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `musteri` (`ID`, `musteriAdi`, `adres`) VALUES
(1, 'Arlen Bales', 'Ankara / Turkey'),
(2, 'Ahman Jardir', 'istanbul / Turkey'),
(3, 'Leasha paper', 'gaziantep Turkey'),
(4, 'Leasha Rock', 'ankara Turkey'),
(5, 'Arlen Bales', 'Ankara / Turkey'),
(6, 'Ahman Jardir', 'Ankara / Turkey'),
(7, 'Doggy Dog', 'Eskisehir Turkey'),
(8, 'Catty Dog', 'Eskisehir Turkey'),
(9, 'Smt ksc', 'Ankara / Turkey'),
(10, 'Deli yavuz', 'istanbul / Turkey'),
(11, 'Yusuf yazici', 'eskisehir Turkey'),
(12, 'Berik Blackdesert', 'Berlin / Germany elmas sokak ');

CREATE TABLE `satinalinanham` (
  `ID` int(11) NOT NULL,
  `alanUreticiID` int(11) NOT NULL,
  `hammaddeID` int(11) NOT NULL,
  `miktar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `siparis` (
  `ID` int(11) NOT NULL,
  `urunID` int(11) NOT NULL,
  `musteriID` int(11) NOT NULL,
  `urunAdet` int(11) NOT NULL,
  `isciMaliyet` int(11) NOT NULL,
  `toplamMaliyet` int(11) NOT NULL,
  `satisFiyati` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `siparis` (`ID`, `urunID`, `musteriID`, `urunAdet`, `isciMaliyet`, `toplamMaliyet`, `satisFiyati`) VALUES
(1, 1, 1, 10, 10, 200, 250),
(2, 1, 2, 30, 30, 85, 85),
(3, 1, 3, 60, 60, 560, 560),
(4, 1, 4, 30, 30, 137, 137),
(5, 2, 7, 10, 10, 10, 12),
(6, 2, 8, 10, 10, 10, 12),
(7, 1, 9, 10, 10, 10, 12),
(8, 1, 10, 100, 100, 155, 186),
(9, 3, 11, 30, 30, 137, 164),
(10, 4, 12, 120, 120, 120, 144);

CREATE TABLE `tedarikci` (
  `ID` int(11) NOT NULL,
  `firmaAdi` varchar(10) NOT NULL,
  `ulke` varchar(20) NOT NULL,
  `sehir` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `tedarikci` (`ID`, `firmaAdi`, `ulke`, `sehir`) VALUES
(1, 'IST1', 'Turkey', 'Istanbul'),
(2, 'IST2', 'Turkey', 'Istanbul'),
(3, 'IST3', 'Turkey', 'Istanbul'),
(4, 'ANK1', 'Turkey', 'Ankara'),
(5, 'ESK1', 'Turkey', 'Eskisehir'),
(6, 'GAZ1', 'Turkey', 'Gaziantep'),
(7, 'LON1', 'England', 'London'),
(8, 'BER1', 'Germany', 'Berlin'),
(9, 'BER2', 'Germany', 'Berlin'),
(10, 'SB1', 'Bosnahersek', 'Saraybosna'),
(11, 'Dota2', 'Germany', 'Berlin'),
(12, 'IST1', 'Turkey', '?stanbul'),
(13, 'Ber2351', 'Turkey', '?stanbul');

CREATE TABLE `tedhammadde` (
  `ID` int(11) NOT NULL,
  `uretenFirmaID` int(11) NOT NULL,
  `hammaddeID` int(11) NOT NULL,
  `stok` int(11) NOT NULL,
  `fiyat` int(11) NOT NULL,
  `uretimTarihi` varchar(20) NOT NULL,
  `rafomru` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `tedhammadde` (`ID`, `uretenFirmaID`, `hammaddeID`, `stok`, `fiyat`, `uretimTarihi`, `rafomru`) VALUES
(1, 1, 2, 640, 10, '13052019', 5),
(3, 1, 3, 700, 12, '13052017', 5),
(5, 1, 5, 1000, 14, '13052018', 4),
(6, 1, 6, 980, 14, '12042015', 8),
(7, 12, 1, 980, 12, '13052018', 4),
(8, 13, 3, 1000, 12, '13052017', 5);

CREATE TABLE `uretici` (
  `ID` int(11) NOT NULL,
  `firmaAdi` varchar(20) NOT NULL,
  `sehir` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `uretici` (`ID`, `firmaAdi`, `sehir`) VALUES
(1, 'BalesCompany', 'Kocaeli');

CREATE TABLE `urunler` (
  `ID` int(11) NOT NULL,
  `ureticiID` int(11) NOT NULL,
  `urunAd` varchar(20) NOT NULL,
  `stok` int(11) NOT NULL,
  `uretimTarihi` varchar(20) NOT NULL,
  `rafOmru` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `urunler` (`ID`, `ureticiID`, `urunAd`, `stok`, `uretimTarihi`, `rafOmru`) VALUES
(1, 1, 'N.1-H.3', 600, '13052019', 4),
(2, 1, 'C.1-O.2', 480, '19052019', 2),
(3, 1, 'C.6-H.12-O.6', 570, '22052019', 5),
(4, 1, 'H.2-O.1', 80, '22052019', 5),
(5, 1, 'H.2-N.4', 200, '22052019', 5),
(6, 1, 'H.1-Cl.1', 20, '22052019', 5);


ALTER TABLE `hammadde`
  ADD PRIMARY KEY (`ID`);

ALTER TABLE `musteri`
  ADD PRIMARY KEY (`ID`);

ALTER TABLE `satinalinanham`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `alanUreticiID` (`alanUreticiID`),
  ADD KEY `satinalinanham_ibfk_2` (`hammaddeID`);

ALTER TABLE `siparis`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `musteriID` (`musteriID`),
  ADD KEY `urunID` (`urunID`);

ALTER TABLE `tedarikci`
  ADD PRIMARY KEY (`ID`);

ALTER TABLE `tedhammadde`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `uretenFirmaID` (`uretenFirmaID`),
  ADD KEY `hammaddeID` (`hammaddeID`);

ALTER TABLE `uretici`
  ADD PRIMARY KEY (`ID`);

ALTER TABLE `urunler`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ureticiID` (`ureticiID`);


ALTER TABLE `satinalinanham`
  ADD CONSTRAINT `satinalinanham_ibfk_1` FOREIGN KEY (`alanUreticiID`) REFERENCES `uretici` (`ID`),
  ADD CONSTRAINT `satinalinanham_ibfk_2` FOREIGN KEY (`hammaddeID`) REFERENCES `tedhammadde` (`ID`);

ALTER TABLE `siparis`
  ADD CONSTRAINT `siparis_ibfk_1` FOREIGN KEY (`musteriID`) REFERENCES `musteri` (`ID`),
  ADD CONSTRAINT `siparis_ibfk_2` FOREIGN KEY (`urunID`) REFERENCES `urunler` (`ID`);

ALTER TABLE `tedhammadde`
  ADD CONSTRAINT `tedhammadde_ibfk_1` FOREIGN KEY (`uretenFirmaID`) REFERENCES `tedarikci` (`ID`),
  ADD CONSTRAINT `tedhammadde_ibfk_2` FOREIGN KEY (`hammaddeID`) REFERENCES `hammadde` (`ID`);

ALTER TABLE `urunler`
  ADD CONSTRAINT `urunler_ibfk_1` FOREIGN KEY (`ureticiID`) REFERENCES `uretici` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
