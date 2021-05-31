-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mar. 18 mai 2021 à 20:11
-- Version du serveur :  10.4.10-MariaDB
-- Version de PHP :  7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `badel`
--

-- --------------------------------------------------------

--
-- Structure de la table `loginadmin`
--

DROP TABLE IF EXISTS `loginadmin`;
CREATE TABLE IF NOT EXISTS `loginadmin` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `prenom` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `nom` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `Sexe` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `pseudo` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `Role` int(3) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `loginadmin`
--

INSERT INTO `loginadmin` (`Id`, `prenom`, `nom`, `Sexe`, `pseudo`, `password`, `Role`) VALUES
(1, 'Bara', 'WADE', 'Mr', 'bara', 'ok', 1);

-- --------------------------------------------------------

--
-- Structure de la table `p1demandeurcollectif`
--

DROP TABLE IF EXISTS `p1demandeurcollectif`;
CREATE TABLE IF NOT EXISTS `p1demandeurcollectif` (
  `idDC` int(20) NOT NULL AUTO_INCREMENT,
  `formulaire_id` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `nom_representant` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `prenom_representant` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `sexe_representant` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `adresse_representant` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `contact1_representant` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `contact2_representant` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `titre` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `nat_juridique` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `denomination` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `reconnaisance_juridique` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `lieu_Collectif` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `pays_exterieur` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `region_exterieur` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `departement_exterieur` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `Qtr_Village_exterieure` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `region_interieure` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `departement_interieure` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `commune_interieure` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `Qtr_Village_exterieur` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `pays` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `region` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `departement` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `commune` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `date_creation` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `total_membre` int(255) NOT NULL,
  `total_homme` int(255) NOT NULL,
  `total_femme` int(255) NOT NULL,
  PRIMARY KEY (`idDC`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `p1demandeurindividuel`
--

DROP TABLE IF EXISTS `p1demandeurindividuel`;
CREATE TABLE IF NOT EXISTS `p1demandeurindividuel` (
  `idDI` int(20) NOT NULL AUTO_INCREMENT,
  `formulaire_id` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prenom` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `nom` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `tel1` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `tel2` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `commune_rattach` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `quartier_rattach` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `commune_actuelle` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `quartier_actuel` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `sexe` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `tranche_age` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `etude` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `niveau_etude` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `formation_prof` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `sejour` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `pays_sejourne` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `motif_sejour` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `experience_prof` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `domaine_exp_prof` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `duree_exp_prof` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `statut_exp_prof` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `region_exp_prof` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `departement_exp_prof` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `commune_exp_prof` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `quartier_exp_prof` longtext CHARACTER SET utf8 NOT NULL,
  `autre_region_exp_prof` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `hors_senegal` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `situation_prof` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `soutien_immediat` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `titre_accompagnement` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`idDI`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `p2demandeurcollectif`
--

DROP TABLE IF EXISTS `p2demandeurcollectif`;
CREATE TABLE IF NOT EXISTS `p2demandeurcollectif` (
  `idDC` int(20) NOT NULL AUTO_INCREMENT,
  `formulaire_id` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `activ_equip` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `activ_equip_depart` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `activ_equip_region` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `activ_equip_autre_region` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `activ_equip_hors_senegal` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `autr_activ_equip` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `a_activ_equip_localite1` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `a_activ_equip_localite2` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `activ_economique` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `mont_cap_social` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `nbre_empl_perman` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `nbre_empl_tempor` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `mont_eparg_mob` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `mont_endettement` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `mont_sub_recu` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `fonctionnalite` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `prise_decision` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `charte_relationnelle` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `plan_developpement` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `manuel_procedure` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `part_princ_technique` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `part_princ_financier` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `app_reseau` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `nature_reseau` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `localite_reseau` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `departement_reseau` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `nat_intern_reseau` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`idDC`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `p2demandeurindividuel`
--

DROP TABLE IF EXISTS `p2demandeurindividuel`;
CREATE TABLE IF NOT EXISTS `p2demandeurindividuel` (
  `idDI` int(20) NOT NULL AUTO_INCREMENT,
  `formulaire_id` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `categories` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sous_categories` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `parcours` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `marqueurs` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idDI`),
  KEY `idDI` (`idDI`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `p3demandeurindividuel`
--

DROP TABLE IF EXISTS `p3demandeurindividuel`;
CREATE TABLE IF NOT EXISTS `p3demandeurindividuel` (
  `idDI` int(20) NOT NULL AUTO_INCREMENT,
  `formulaire_id` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `regi_commerce` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `numero_regi_comm` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ninea` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `numero_ninea` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `reference_prof` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `numero_reference_prof` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `compte_bancaire_sfd` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nom_banque_sfd` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `numero_compte_banque_sfd` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `soutien_partenaire` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ville_partenaire` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pays_partenaire` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idDI`),
  KEY `idDI` (`idDI`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
