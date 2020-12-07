-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le : lun. 07 déc. 2020 à 02:24
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP : 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `Badel`
--

-- --------------------------------------------------------

--
-- Structure de la table `loginadmin`
--

CREATE TABLE `loginadmin` (
  `Id` int(11) NOT NULL,
  `prenom` varchar(1000) NOT NULL,
  `nom` varchar(1000) NOT NULL,
  `Sexe` varchar(10) NOT NULL,
  `pseudo` varchar(1000) NOT NULL,
  `password` varchar(1000) NOT NULL,
  `Role` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `loginadmin`
--

INSERT INTO `loginadmin` (`Id`, `prenom`, `nom`, `Sexe`, `pseudo`, `password`, `Role`) VALUES
(1, 'Bara', 'WADE', 'M', 'Bara', 'pass', 1);

-- --------------------------------------------------------

--
-- Structure de la table `p1demadeurindividuel`
--

CREATE TABLE `p1demadeurindividuel` (
  `idDI` int(20) NOT NULL,
  `prenom` varchar(1000) NOT NULL,
  `nom` varchar(1000) NOT NULL,
  `tel1` varchar(1000) NOT NULL,
  `tel2` varchar(1000) NOT NULL,
  `commune_rattach` varchar(1000) NOT NULL,
  `commune_actuelle` varchar(1000) NOT NULL,
  `titre_accompagnement` varchar(1000) NOT NULL,
  `sexe` varchar(100) NOT NULL,
  `tranche_age` varchar(1000) NOT NULL,
  `etude` varchar(10) NOT NULL,
  `niveau_etude` varchar(100) NOT NULL,
  `sejour` varchar(1000) NOT NULL,
  `pays_sejourne` varchar(1000) NOT NULL,
  `motif_sejour` varchar(1000) NOT NULL,
  `formation_prof` varchar(10) NOT NULL,
  `experience_prof` varchar(10) NOT NULL,
  `domaine_exp_prof` varchar(1000) NOT NULL,
  `duree_exp_prof` varchar(1000) NOT NULL,
  `statut_exp_prof` varchar(1000) NOT NULL,
  `commune_exp_prof` varchar(1000) NOT NULL,
  `departement_exp_prof` varchar(1000) NOT NULL,
  `region_exp_prof` varchar(1000) NOT NULL,
  `autre_region_exp_prof` varchar(1000) NOT NULL,
  `hors_sengal_exp_prof` varchar(1000) NOT NULL,
  `situation_prof` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `p1demandeurcollectif`
--

CREATE TABLE `p1demandeurcollectif` (
  `idDC` int(20) NOT NULL,
  `titre` varchar(1000) NOT NULL,
  `nat_juridique` varchar(1000) NOT NULL,
  `denomination` varchar(1000) NOT NULL,
  `reconnaisance_juridique` varchar(10) NOT NULL,
  `pays` varchar(1000) NOT NULL,
  `region` varchar(1000) NOT NULL,
  `departement` varchar(1000) NOT NULL,
  `commune` varchar(1000) NOT NULL,
  `hors_senegal` varchar(1000) NOT NULL,
  `date_creation` varchar(1000) NOT NULL,
  `total_membre` int(255) NOT NULL,
  `total_homme` int(255) NOT NULL,
  `total_femme` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `p2demandeurcollectif`
--

CREATE TABLE `p2demandeurcollectif` (
  `idDC` int(20) NOT NULL,
  `activ_equip` varchar(10) NOT NULL,
  `activ_equip_depart` varchar(1000) NOT NULL,
  `activ_equip_region` varchar(1000) NOT NULL,
  `activ_equip_autre_region` varchar(1000) NOT NULL,
  `activ_equip_hors_senegal` varchar(1000) NOT NULL,
  `activ_economique` varchar(1000) NOT NULL,
  `sit_economique` varchar(1000) NOT NULL,
  `fonctionnalité` varchar(1000) NOT NULL,
  `prise_decision` varchar(1000) NOT NULL,
  `charte_relationnelle` varchar(1000) NOT NULL,
  `plan_developpement` varchar(1000) NOT NULL,
  `manuel_procedure` varchar(1000) NOT NULL,
  `part_princ_technique` varchar(1000) NOT NULL,
  `part_princ_financier` varchar(1000) NOT NULL,
  `app_reseau` varchar(1000) NOT NULL,
  `nature_reseau` varchar(1000) NOT NULL,
  `localite_reseau` varchar(1000) NOT NULL,
  `departement_reseau` varchar(1000) NOT NULL,
  `international_reseau` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `p2demandeurindividuel`
--

CREATE TABLE `p2demandeurindividuel` (
  `idDI` int(20) NOT NULL,
  `categories` varchar(1000) NOT NULL,
  `sous_categories` varchar(1000) NOT NULL,
  `parcours` varchar(1000) NOT NULL,
  `marqueurs` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `p3demandeurindividuel`
--

CREATE TABLE `p3demandeurindividuel` (
  `idDI` int(20) NOT NULL,
  `soutien_immediat` varchar(1000) NOT NULL,
  `regi_commerce` varchar(10) NOT NULL,
  `ninea` varchar(10) NOT NULL,
  `ref_prof` varchar(1000) NOT NULL,
  `compte_bancaire_sfd` varchar(100) NOT NULL,
  `nom_banque_sfd` varchar(100) NOT NULL,
  `soutien_parent` varchar(100) NOT NULL,
  `ville_parent` varchar(100) NOT NULL,
  `pays_parent` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `loginadmin`
--
ALTER TABLE `loginadmin`
  ADD PRIMARY KEY (`Id`);

--
-- Index pour la table `p1demadeurindividuel`
--
ALTER TABLE `p1demadeurindividuel`
  ADD PRIMARY KEY (`idDI`);

--
-- Index pour la table `p1demandeurcollectif`
--
ALTER TABLE `p1demandeurcollectif`
  ADD PRIMARY KEY (`idDC`);

--
-- Index pour la table `p2demandeurcollectif`
--
ALTER TABLE `p2demandeurcollectif`
  ADD KEY `p2demandeurcollectif_ibfk_1` (`idDC`);

--
-- Index pour la table `p2demandeurindividuel`
--
ALTER TABLE `p2demandeurindividuel`
  ADD KEY `idDI` (`idDI`);

--
-- Index pour la table `p3demandeurindividuel`
--
ALTER TABLE `p3demandeurindividuel`
  ADD KEY `idDI` (`idDI`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `loginadmin`
--
ALTER TABLE `loginadmin`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `p1demadeurindividuel`
--
ALTER TABLE `p1demadeurindividuel`
  MODIFY `idDI` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `p1demandeurcollectif`
--
ALTER TABLE `p1demandeurcollectif`
  MODIFY `idDC` int(20) NOT NULL AUTO_INCREMENT;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `p2demandeurcollectif`
--
ALTER TABLE `p2demandeurcollectif`
  ADD CONSTRAINT `p2demandeurcollectif_ibfk_1` FOREIGN KEY (`idDC`) REFERENCES `p1demandeurcollectif` (`idDC`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `p2demandeurindividuel`
--
ALTER TABLE `p2demandeurindividuel`
  ADD CONSTRAINT `p2demandeurindividuel_ibfk_1` FOREIGN KEY (`idDI`) REFERENCES `p1demadeurindividuel` (`idDI`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `p3demandeurindividuel`
--
ALTER TABLE `p3demandeurindividuel`
  ADD CONSTRAINT `p3demandeurindividuel_ibfk_1` FOREIGN KEY (`idDI`) REFERENCES `p1demadeurindividuel` (`idDI`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
