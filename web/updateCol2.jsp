<%-- 
    Document   : inscriptionCollective2
    Created on : 7 d�c. 2020, 02:58:53
    Author     : MSGB
--%>

<%@page import="dao.dataAccess"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="dbutil.JavaConnect"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!doctype html>

<html class="no-js" lang="">


    <head>
        <meta charset="ISO-8859-1">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Modifier Collective 2</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="icon" href="favicon.ico">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/icomoon.css">
        <link rel="stylesheet" href="css/transitions.css">
        <link rel="stylesheet" href="css/prettyPhoto.css">
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="css/pogoslider.css">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="css/color.css">
        <link rel="stylesheet" href="css/responsive.css">
        <script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
    </head>

    <body>
        <%
            String formulaire_idx = request.getParameter("formulaire_id");
            String formulaire_id = (String) request.getAttribute("formulaire_id");

            if (formulaire_id == null) {
                formulaire_id = formulaire_idx;
            }

            String ix = request.getParameter("id");
            String idx = (String) request.getAttribute("id");
            String tpe = (String) request.getAttribute("tpe");
            if (idx == null) {
                idx = ix;
            }
            String sql = "SELECT * FROM loginadmin where Id=?";
            try {
                Connection con = new JavaConnect().createConnection();
                PreparedStatement pst, pst1;

                // String idx = "0";
                pst = con.prepareStatement(sql);
                pst.setString(1, ix);
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    System.out.println("hello 4");
                    String id = rs.getString(1);
                    String Prenom = rs.getString(2);
                    String nom = rs.getString(3);
                    String Civilite = rs.getString(4);
        %>
        <!--************************************
                            Loader Start
            *************************************-->
        <div class="lds-roller">
            <div></div>
            <div></div>
            <div></div>
            <div></div>
            <div></div>
            <div></div>
            <div></div>
            <div></div>
        </div>
        <!--************************************
                            Loader End
            *************************************-->
        <!--************************************
                            Wrapper Start
            *************************************-->
        <div id="at-wrapper" class="at-wrapper">
            <!--************************************
                                    Header Start
                    *************************************-->
            <header id="at-header" class="at-header at-headervthree">
                <div class="container-fluid">
                    <div class="row">
                        <strong class="at-logo"><a href="index.html"><img src="images/logo2.png" alt="company logo here"></a></strong>
                        <div class="at-navigationarea">
                            <nav id="at-nav" class="at-nav">
                                <div class="navbar-header">
                                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#at-navigation" aria-expanded="false">
                                        <span class="sr-only">Toggle navigation</span>
                                        <span class="icon-bar"></span>
                                        <span class="icon-bar"></span>
                                        <span class="icon-bar"></span>
                                    </button>
                                </div>
                                <div id="at-navigation" class="collapse navbar-collapse at-navigation">
                                    <ul>
                                        <li class="menu-item-has-children">
                                            <a href="index.html">Accueil</a>
                                        </li>
                                        <li class="menu-item-has-children">
                                            <a href="Principal.jsp?id=<%=ix%>">Menu Admin</a>
                                        </li>
                                        <li class="menu-item-has-children">
                                            <a href="connection.html">Se d�connecter</a>
                                        </li>
                                    </ul>
                                </div>
                            </nav>
                            <div class="at-contactsocial">
                                <span class="at-contactnumber">
                                    <i class="icon-telephone114"></i>
                                    <em>+00221 33 837 80 09</em>
                                </span>
                                <ul class="at-socialicons">
                                    <li class="at-facebook"><a href="https://www.facebook.com/badel"><i class="fa fa-facebook"></i></a></li>
                                    <li class="at-twitter"><a href="https://www.twitter.com/badel"><i class="fa fa-twitter"></i></a></li>
                                    <li class="at-instagram"><a href="https://www.youtube.com/badel"><i class="fa fa-youtube"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
            <!--************************************
                                    Header End
                    *************************************-->
            <!--************************************
                                    Home Slider Start
                    *************************************-->

            <!--************************************
                                    Home Slider End
                    *************************************-->
            <!--************************************
                                    Main Start
                    *************************************-->
            <%
                /* R�cup�ration des donn�es de p2demandCol*/
                //int compte1 = 1;
                String form2Con1 = "";
                String form2Con2 = "";
                String form2Con3 = "";
                String form2Con4 = "";
                String form2Con5 = "";
                String form2Con6 = "";
                String form2Con7 = "";
                String form2Con8 = "";
                String form2Con9 = "";
                String form2Con10 = "";
                String form2Con11 = "";
                String form2Con12 = "";
                String form2Con13 = "";
                String form2Con14 = "";
                String form2Con15 = "";
                String form2Con16 = "";
                String form2Con17 = "";
                String form2Con18 = "";
                String form2Con19 = "";
                String form2Con20 = "";
                String form2Con21 = "";
                String form2Con22 = "";
                String form2Con23 = "";
                String form2Con24 = "";
                String form2Con25 = "";
                String form2Con26 = "";

                try {

                    String sql1 = "SELECT * FROM `p2demandeurcollectif` WHERE `formulaire_id` LIKE '" + formulaire_id + "'";
                    // String idx = "0";
                    pst1 = con.prepareStatement(sql1);
                    ResultSet rs1 = pst1.executeQuery();

                    System.out.println("hey1");
                    while (rs1.next()) {

                        form2Con1 = rs1.getString(1);
                        form2Con2 = rs1.getString(2);
                        form2Con3 = rs1.getString(3);
                        form2Con4 = rs1.getString(4);
                        form2Con5 = rs1.getString(5);
                        form2Con6 = rs1.getString(6);
                        form2Con7 = rs1.getString(7);
                        form2Con8 = rs1.getString(8);
                        form2Con9 = rs1.getString(9);
                        form2Con10 = rs1.getString(10);
                        form2Con11 = rs1.getString(11);
                        form2Con12 = rs1.getString(12);
                        form2Con13 = rs1.getString(13);
                        form2Con14 = rs1.getString(14);
                        form2Con15 = rs1.getString(15);
                        form2Con16 = rs1.getString(16);
                        form2Con17 = rs1.getString(17);
                        form2Con18 = rs1.getString(18);
                        form2Con19 = rs1.getString(19);
                        form2Con20 = rs1.getString(20);
                        form2Con21 = rs1.getString(21);
                        form2Con22 = rs1.getString(22);
                        form2Con23 = rs1.getString(23);
                        form2Con24 = rs1.getString(24);
                        form2Con25 = rs1.getString(25);
                        form2Con26 = rs1.getString(26);

                        System.out.println("hey2");
                    }
                } catch (SQLException ex) {
                    System.out.println("Erreur recup col2 " + ex);
                }
            %>
            <main id="at-main" class="at-main at-haslayout">

                <div class="clearfix"></div>
                <section class="at-sectionspace at-haslayout">
                    <div class="container">
                        <h1 style="text-align: center;">Inscription Collective form = <%=formulaire_id%></h1>
                        <div class="row">
                            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                                <div class="at-content">
                                    <div class="at-contactusvone">
                                        <form class="at-formtheme at-formcontacus"  action="UpdateCol2" method="post">

                                            <div class="at-sectiontitleborder">
                                                <br/>
                                                <hr/>
                                                <h2><center>Veuillez remplir ce formulaire : <strong>Etape 2</strong> </center></h2>
                                                <hr/>
                                            </div>
                                            <br/>
                                            <fieldset>
                                                <div class="row">
                                                    <hr/>
                                                    <h3><center>IDENTIFICATION PROFIL ECONOMIQUE DU COLLECTIF-DEMANDEUR </center></h3> 
                                                    <h4><center><strong> Avez-vous des activit&eacute;s ou &eacute;quipements dans la commune? </strong></center></h4>   
                                                    <hr/>

                                                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                        <div class="form-group">
                                                            <select class="form-control" name="activ_equip" id="demo-category" onchange="changementType(this.value);">
                                                                <option value="<%=form2Con3%>">1- Avez-vous des activit&eacute;s ou &eacute;quipements dans la commune ? -</option>
                                                                <option value="OUI">OUI</option>
                                                                <option value="NON">NON</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                        <div class="form-group">
                                                            <input type="text" name="activ_equip_depart" value="<%=form2Con4%>" class="form-control" placeholder="2- Dans quelle d&eacute;partement ? ">
                                                        </div>
                                                    </div>  
                                                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                        <div class="form-group">
                                                            <input type="text" name="activ_equip_region" value="<%=form2Con5%>" class="form-control" placeholder="3- Dans quel r&eacute;gion ? ">
                                                        </div>
                                                    </div>  
                                                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 pull-left">
                                                        <div class="form-group">
                                                            <input type="text" name="activ_equip_autre_region" value="<%=form2Con6%>" class="form-control" placeholder="4- Dans quelle autre r&eacute;gion ? ">
                                                        </div>
                                                    </div>   
                                                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 pull-left">
                                                        <div class="form-group">
                                                            <input type="text" name="activ_equip_hors_senegal" value="<%=form2Con7%>" class="form-control" placeholder="5- Hors S&eacute;n&eacute;gal ? ">
                                                        </div>
                                                    </div>

                                                    <fieldset>
                                                        <div class="row">
                                                            <hr/>
                                                            <h4><center><strong>Quelles activit&eacute;s &eacute;conomiques sont men&eacute;es par le Collectif ? </strong></center></h4>  
                                                            <hr/>
                                                    </fieldset>
                                                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-12 pull-left">
                                                        <div class="form-group">
                                                            <select class="form-control" name="activ_economique" id="demo-category" onchange="changementType(this.value);">
                                                                <option value="<%=form2Con8%>">- Quelles activit&eacute;s &eacute;conomiques sont men&eacute;es par le Collectif ? -</option>
                                                                <option value="Epargne">Epargne</option>
                                                                <option value="Production">Production</option>
                                                                <option value="Transformation">Transformation</option>
                                                                <option value="Distribution - Commerce">Distribution - Commerce</option>
                                                                <option value="Transport et Manutention">Transport et Manutention</option>
                                                                <option value="Autres services">Autres services</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <fieldset>
                                                        <div class="row">
                                                            <hr/>
                                                            <h4><center><strong>Quelle est la situation economique du Collectif ? </strong></center></h4>  
                                                            <hr/>
                                                    </fieldset>

                                                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                        <div class="form-group">
                                                            <input type="text" name="mont_cap_social" value="<%=form2Con9%>" class="form-control" placeholder=" 1- Quel est le montant Capital social ?">
                                                        </div>
                                                    </div>
                                                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                        <div class="form-group">
                                                            <input type="text" name="nbre_empl_perman" value="<%=form2Con10%>" class="form-control" placeholder=" 2- Quel est le nombre d'employ&eacute;s permanents actuellement ? ">
                                                        </div>
                                                    </div>
                                                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                        <div class="form-group">
                                                            <input type="text" name="nbre_empl_tempor" value="<%=form2Con11%>" class="form-control" placeholder=" 3-  Quel est le nombre d'employ&eacute;s temporaires actuellement ? ">
                                                        </div>
                                                    </div>
                                                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                        <div class="form-group">
                                                            <input type="text" name="mont_eparg_mob" value="<%=form2Con12%>" class="form-control" placeholder=" 4- Quel est le montant �pagn&eacute; mobilis&eacute; ces trois (3ans) derni�res ann&eacute;es ? ">
                                                        </div>
                                                    </div>
                                                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                        <div class="form-group">
                                                            <input type="text" name="mont_endettement" value="<%=form2Con13%>" class="form-control" placeholder=" 5- Quel est le montant endettement ces trois (3ans) derni�res ann&eacute;es ? ">
                                                        </div>
                                                    </div>
                                                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                        <div class="form-group">
                                                            <input type="text" name="mont_sub_recu" value="<%=form2Con14%>" class="form-control" placeholder=" 6- Quel est le montant subvention re�u ces trois (3ans) derni�res ann&eacute;es ?">
                                                        </div>
                                                    </div>

                                                    <fieldset>
                                                        <div class="row">
                                                            <hr/>
                                                            <h3><center>IDENTIFICATION PROFIL GOUVERNANCE DU COLLECTIF-DEMANDEUR</center></h3>
                                                            <h4><center><strong>Quelle est la situation de la gouvernance du Collectif ?</strong></center></h4>  
                                                            <hr/>
                                                    </fieldset>
                                                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                        <div class="form-group">
                                                            <input type="text" name="fonctionnalite" value="<%=form2Con15%>" class="form-control" placeholder="1- Fonctionnalit&eacute; des organes?">
                                                        </div>
                                                    </div>


                                                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                        <div class="form-group">
                                                            <input type="text" name="prise_decision" value="<%=form2Con16%>" class="form-control" placeholder="2- Mode prise de d&eacute;cision?">
                                                        </div>
                                                    </div>

                                                    <!--  <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                          <div class="form-group">
                                                              <input type="text" name="charte_relationnelle" class="form-control" placeholder="3- Disponibilit? d'une charte des membres ?">
                                                          </div>
                                                      </div>
                                                    -->
                                                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                        <div class="form-group">
                                                            <select class="form-control" name="charte_relationnelle" id="demo-category" onchange="changementType(this.value);">
                                                                <option value="<%=form2Con17%>"> 3- Disponibilit&eacute; d'une charte des membres ? -</option>
                                                                <option value="OUI">OUI</option>
                                                                <option value="NON">NON</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <!--  <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                          <div class="form-group">
                                                              <input type="text" name="plan_developpement" class="form-control" placeholder="4- Disponibilit? d'un plan de developpement ? ">
                                                          </div>
                                                      </div>  
                                                    -->
                                                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 pull-left">
                                                        <div class="form-group">
                                                            <select class="form-control" name="plan_developpement" id="demo-category" onchange="changementType(this.value);">
                                                                <option value="<%=form2Con18%>"> 4- Disponibilit&eacute; d'un plan de d&eacute;veloppement ? -</option>
                                                                <option value="OUI">OUI</option>
                                                                <option value="NON">NON</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <!-- <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                          <div class="form-group">
                                                              <input type="text" name="manuel_procedure" class="form-control" placeholder="5- Disponibilit? d'un manuel de proc?dure ? ">
                                                          </div>
                                                      </div> 
                                                    -->
                                                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 pull-left">
                                                        <div class="form-group">
                                                            <select class="form-control" name="manuel_procedure" id="demo-category" onchange="changementType(this.value);">
                                                                <option value="<%=form2Con19%>"> 5- Disponibilit&eacute; d'un manuel de proc&eacute;dure ? -</option>
                                                                <option value="OUI">OUI</option>
                                                                <option value="NON">NON</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                </div>
                                            </fieldset>
                                            <br />
                                            <hr />

                                            <fieldset>
                                                <div class="row">

                                                    <hr />
                                                    <h4><center><strong> Quelle Est La strat&eacute;gie partenariale Du Collectif ? </strong></center></h4> 
                                                    <hr />

                                                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                        <div class="form-group">
                                                            <input type="text" name="part_princ_technique" value="<%=form2Con20%>" class="form-control" placeholder="1- Principal Partenaire technique ? -">
                                                        </div>
                                                    </div>  
                                                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                        <div class="form-group">
                                                            <input type="text" name="part_princ_financier" value="<%=form2Con21%>" class="form-control" placeholder="2- Principal Partenaire financier ? -">
                                                        </div>
                                                    </div>     

                                                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                        <div class="form-group">
                                                            <select class="form-control" name="app_reseau" id="demo-category" onchange="changementType(this.value);">
                                                                <option value="<%=form2Con22%>">3 - Appartenance &agrave; un r&eacute;seau ? -</option>
                                                                <option value="OUI">OUI</option>
                                                                <option value="NON">NON</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <br />
                                                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                        <div class="form-group">
                                                            <input type="text" name="nature_reseau" value="<%=form2Con23%>" class="form-control" placeholder="4- Nature R&eacute;seau ? -">
                                                        </div>
                                                    </div>

                                                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                        <div class="form-group">
                                                            <input type="text" name="localite_reseau" value="<%=form2Con24%>" class="form-control" placeholder="5- Localit&eacute; du R&eacute;seau ? -">
                                                        </div>
                                                    </div>
                                                    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 pull-left">
                                                        <div class="form-group">
                                                            <input type="text" name="departement_reseau" value="<%=form2Con25%>" class="form-control" placeholder="6- Departement R&eacute;seau ? -">
                                                        </div>
                                                    </div>
                                                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 pull-left">
                                                        <div class="form-group">
                                                            <select class="form-control" name="nat_intern_reseau" id="demo-category" onchange="changementType(this.value);">
                                                                <option value="<%=form2Con26%>">7- National ou International ? -</option>
                                                                <option value="national">National</option>
                                                                <option value="international">International</option>
                                                            </select>
                                                        </div>
                                                    </div> 
                                                    <hr/>
                                            </fieldset>
                                            <fieldset>
                                                <hr/>
                                                <input type="hidden" value="<%=formulaire_id%>" name="formulaire_id">  
                                                <input type="hidden" value="<%=idx%>" name="id">  
                                                <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 pull-left">
                                                    <center><button type="submit" class="at-btn">ENREGISTRER LES MODIFICATIONS</button></center>
                                                </div>
                                                </div>
                                                <hr/>
                                            </fieldset>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
            </main>
            <!--************************************
                                    Main End
                    *************************************-->
            <!--************************************
                                    Footer Start
                    *************************************-->
            <footer id="at-footer" class="at-footer at-haslayout">
                <div class="container">
                    <div class="row">
                        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                            <div class="at-emailsubscribearea">
                                <p>Recevez nos derni?res informations</p>
                                <form class="at-formtheme at-formnewsletter">
                                    <fieldset>
                                        <input type="email" name="email" class="form-control" placeholder="Votre adresse e-mail">
                                        <button class="at-btn" type="submit">Souscrire</button>
                                    </fieldset>
                                </form>
                            </div>
                            <div class="at-threecolumns">
                                <div class="at-fcolumn">
                                    <div class="at-widget at-widgettext">
                                        <strong class="at-logo"><a href="javascript:void(0);"><img src="images/logof.png" alt="image description"></a></strong>
                                        <!--     <div class="at-description">
                                                 <p>Lorem ipsum dolor sit amet, consectetur adi pisi cing elit, sed do eiusmod tempor Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, the consectetur.</p>
                                             </div> -->
                                        <ul class="at-socialicons">
                                            <li class="at-facebook"><a href="www.facebook.com/taataan"><i class="fa fa-facebook"></i></a></li>
                                            <li class="at-twitter"><a href="#"><i class="fa fa-twitter"></i></a></li>
                                            <li class="at-instagram"><a href="www.youtube.com/taataan"><i class="fa fa-youtube"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="at-fcolumn">
                                    <div class="at-widget at-widgetusefullinks">
                                        <div class="at-fwidgettitle">
                                            <h3>Liens Utiles</h3>
                                        </div>
                                        <div class="at-widgetcontent">
                                            <ul>
                                                <li><a href="index.html">Accueil</a></li>
                                                <li><a href="javascript:void(0);">S'INSCRIRE</a></li>
                                                <li><a href="https://www.adel-invest.com">Adel-invest</a></li>
                                                <li><a href="https://www.taataan.sn">Taataan</a></li>
                                                <li><p>Email: contact@taataan.sn</p></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div class="at-fcolumn">
                                    <div class="at-widget">
                                        <div class="at-fwidgettitle">
                                            <h3>Recent News</h3>
                                        </div>
                                        <div class="at-widgetcontent">
                                            <ul>
                                                <li>
                                                    <!--    <p>Product Design &amp; Branding Innovative Brand Design Concepts</p> -->
                                                    <time datetime="2018-01-12">January 28, 2018</time>
                                                </li>
                                                <li>
                                                    <!--    <p>Product Design &amp; Branding Innovative Brand Design Concepts</p> -->
                                                    <time datetime="2020-24-11">Novembre 24, 2020</time>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="at-copyright">
                                <p>Adresse: ZAC MBAO villa N?3 4i?me Etage Cit? Socidak 1 en face Brioche Dor?e, Rufisque Ouvert de 08H ? 18H</p>
                                <p>Copyright @ 2020. <a href="javascript:void(0);">Badel</a> All rights reserved.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </footer>
            <!--************************************
                                    Footer End
                    *************************************-->
            <%
                }
                con.close();
                System.out.println("Connection Closed");
            } catch (SQLException ex) {%>

            <main id="at-main" class="at-main at-haslayout">

                <div class="clearfix"></div>
                <section class="at-sectionspace at-haslayout">
                    <div class="container">
                        <h1 style="text-align: center;">Erreur id Conect1</h1>
                        <div class="row">
                            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                                <div class="at-content">
                                    <div class="at-contactusvone">

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
            </main>
            <%
                }
            %>
        </div>
        <!--************************************
                            Wrapper End
            *************************************-->
        <script src="js/vendor/jquery-library.js"></script>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCcvAXp35fi4q7HXm7vcG9JMtzQbMzjRe8"></script>
        <script src="js/vendor/jquery-migrate.js"></script>
        <script src="js/vendor/bootstrap.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/Chart.bundle.min.js"></script>
        <script src="js/isotope.pkgd.js"></script>
        <script src="js/prettyPhoto.js"></script>
        <script src="js/jquery.vide.js"></script>
        <script src="js/pogoslider.js"></script>
        <script src="js/countTo.js"></script>
        <script src="js/appear.js"></script>
        <script src="js/gmap3.js"></script>
        <script src="js/function.js"></script>
    </body>

</html>