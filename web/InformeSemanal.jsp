<%-- 
    Document   : Busquedas
    Created on : 15/10/2018, 07:44:52 PM
    Author     : Sebastian
--%>






<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <title>Informe Semanal</title>
        <!-- Favicon-->
        <link rel="icon" href="favicon.ico" type="image/x-icon">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" type="text/css">

        <!-- Bootstrap Core Css -->
        <link href="plugins/bootstrap/css/bootstrap.css" rel="stylesheet">

        <!-- Waves Effect Css -->
        <link href="plugins/node-waves/waves.css" rel="stylesheet" />

        <!-- Animation Css -->
        <link href="plugins/animate-css/animate.css" rel="stylesheet" />

        <!-- Custom Css -->
        <link href="css/style.css" rel="stylesheet">

        <!-- Bootstrap Select Css -->
        <link href="plugins/bootstrap-select/css/bootstrap-select.css" rel="stylesheet" />

        <!-- AdminBSB Themes. You can choose a theme from css/themes instead of get all themes -->
        <link href="css/themes/all-themes.css" rel="stylesheet" />

        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.min.js"></script>
    </head>

    <body class="theme-indigo">
        <!-- Page Loader -->
        <div class="page-loader-wrapper">
            <div class="loader">
                <div class="preloader">
                    <div class="spinner-layer pl-red">
                        <div class="circle-clipper left">
                            <div class="circle"></div>
                        </div>
                        <div class="circle-clipper right">
                            <div class="circle"></div>
                        </div>
                    </div>
                </div>
                <p>Cargando...</p>
            </div>
        </div>
        <!-- #END# Page Loader -->
        <!-- Overlay For Sidebars -->
        <div class="overlay"></div>
        <!-- #END# Overlay For Sidebars -->
        <!-- Search Bar -->
        <!-- #END# Search Bar -->
        <!-- Top Bar -->
        <nav class="navbar">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a href="javascript:void(0);" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse" aria-expanded="false"></a>
                    <a href="javascript:void(0);" class="bars"></a>
                    <a class="navbar-brand" href="">ADMINISTRADOR - INFORME SEMANAL</a>
                </div>
                <div class="collapse navbar-collapse" id="navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <!-- Notifications -->
                        <li class="dropdown">
                            <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" role="button">
                                <i class="material-icons">notifications</i>
                                <span class="label-count">7</span>
                            </a>

                            <ul class="dropdown-menu">
                                <li class="header">NOTIFICATIONS</li>
                                <li class="body">
                                    <ul class="menu">
                                        <li>
                                            <a href="javascript:void(0);">
                                                <div class="icon-circle bg-light-green">
                                                    <i class="material-icons">person_add</i>
                                                </div>
                                                <div class="menu-info">
                                                    <h4>12 new members joined</h4>
                                                    <p>
                                                        <i class="material-icons">access_time</i> 14 mins ago
                                                    </p>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0);">
                                                <div class="icon-circle bg-cyan">
                                                    <i class="material-icons">add_shopping_cart</i>
                                                </div>
                                                <div class="menu-info">
                                                    <h4>4 sales made</h4>
                                                    <p>
                                                        <i class="material-icons">access_time</i> 22 mins ago
                                                    </p>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0);">
                                                <div class="icon-circle bg-red">
                                                    <i class="material-icons">delete_forever</i>
                                                </div>
                                                <div class="menu-info">
                                                    <h4><b>Nancy Doe</b> deleted account</h4>
                                                    <p>
                                                        <i class="material-icons">access_time</i> 3 hours ago
                                                    </p>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0);">
                                                <div class="icon-circle bg-orange">
                                                    <i class="material-icons">mode_edit</i>
                                                </div>
                                                <div class="menu-info">
                                                    <h4><b>Nancy</b> changed name</h4>
                                                    <p>
                                                        <i class="material-icons">access_time</i> 2 hours ago
                                                    </p>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0);">
                                                <div class="icon-circle bg-blue-grey">
                                                    <i class="material-icons">comment</i>
                                                </div>
                                                <div class="menu-info">
                                                    <h4><b>John</b> commented your post</h4>
                                                    <p>
                                                        <i class="material-icons">access_time</i> 4 hours ago
                                                    </p>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0);">
                                                <div class="icon-circle bg-light-green">
                                                    <i class="material-icons">cached</i>
                                                </div>
                                                <div class="menu-info">
                                                    <h4><b>John</b> updated status</h4>
                                                    <p>
                                                        <i class="material-icons">access_time</i> 3 hours ago
                                                    </p>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0);">
                                                <div class="icon-circle bg-purple">
                                                    <i class="material-icons">settings</i>
                                                </div>
                                                <div class="menu-info">
                                                    <h4>Settings updated</h4>
                                                    <p>
                                                        <i class="material-icons">access_time</i> Yesterday
                                                    </p>
                                                </div>
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="footer">
                                    <a href="javascript:void(0);">View All Notifications</a>
                                </li>
                            </ul> 


                        </li>
                        <!-- #END# Notifications -->
                        <!-- Tasks -->
                        <li class="dropdown">
                            <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" role="button">
                                <i class="material-icons">flag</i>
                                <span class="label-count">9</span>
                            </a>
                            <ul class="dropdown-menu">
                                <li class="header">TASKS</li>
                                <li class="body">
                                    <ul class="menu tasks">
                                        <li>
                                            <a href="javascript:void(0);">
                                                <h4>
                                                    Footer display issue
                                                    <small>32%</small>
                                                </h4>
                                                <div class="progress">
                                                    <div class="progress-bar bg-pink" role="progressbar" aria-valuenow="85" aria-valuemin="0" aria-valuemax="100" style="width: 32%">
                                                    </div>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0);">
                                                <h4>
                                                    Make new buttons
                                                    <small>45%</small>
                                                </h4>
                                                <div class="progress">
                                                    <div class="progress-bar bg-cyan" role="progressbar" aria-valuenow="85" aria-valuemin="0" aria-valuemax="100" style="width: 45%">
                                                    </div>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0);">
                                                <h4>
                                                    Create new dashboard
                                                    <small>54%</small>
                                                </h4>
                                                <div class="progress">
                                                    <div class="progress-bar bg-teal" role="progressbar" aria-valuenow="85" aria-valuemin="0" aria-valuemax="100" style="width: 54%">
                                                    </div>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0);">
                                                <h4>
                                                    Solve transition issue
                                                    <small>65%</small>
                                                </h4>
                                                <div class="progress">
                                                    <div class="progress-bar bg-orange" role="progressbar" aria-valuenow="85" aria-valuemin="0" aria-valuemax="100" style="width: 65%">
                                                    </div>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0);">
                                                <h4>
                                                    Answer GitHub questions
                                                    <small>92%</small>
                                                </h4>
                                                <div class="progress">
                                                    <div class="progress-bar bg-purple" role="progressbar" aria-valuenow="85" aria-valuemin="0" aria-valuemax="100" style="width: 92%">
                                                    </div>
                                                </div>
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="footer">
                                    <a href="javascript:void(0);">View All Tasks</a>
                                </li>
                            </ul>
                        </li>
                        <!-- #END# Tasks -->
                        <!-- #SIGN OUT -->
                        <li class="dropdown">
                            <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" role="button">
                                <i class="material-icons">input</i>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- #Top Bar -->
        <section>
            <!-- Left Sidebar -->

            <aside id="leftsidebar" class="sidebar">
                <!-- User Info -->
                <div class="user-info">
                    <div class="image">
                        <img src="images/user.png" width="48" height="48" alt="User" />
                    </div>
                    <div class="info-container">
                        <div class="name" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">John Doe</div>
                        <div class="email">john.doe@example.com</div>
                        <div class="btn-group user-helper-dropdown">
                            <i class="material-icons" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">keyboard_arrow_down</i>
                            <ul class="dropdown-menu pull-right">
                                <li><a href="javascript:void(0);"><i class="material-icons">person</i>Profile</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="javascript:void(0);"><i class="material-icons">group</i>Followers</a></li>
                                <li><a href="javascript:void(0);"><i class="material-icons">shopping_cart</i>Sales</a></li>
                                <li><a href="javascript:void(0);"><i class="material-icons">favorite</i>Likes</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="javascript:void(0);"><i class="material-icons">input</i>Sign Out</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <!-- #User Info -->
                <!-- Menu -->
                <div class="menu">
                    <ul class="list">
                        <li class="header">Menu</li>
                        <li>
                            <a href="ServlectAdministrador">
                                <i class="material-icons">home</i>
                                <span>Inicio</span>
                            </a>
                        </li>

                        <li>
                            <a href="javascript:void(0);" class="menu-toggle">
                                <i class="material-icons">group</i>
                                <span>Operarios</span>
                            </a>
                            <ul class="ml-menu">
                                <li>
                                    <a href="ServlectRegistro">Registro</a>
                                </li>
                                <li>
                                    <a href="ServlectAsignacionTurnos">Asignación de Turnos</a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a href="ServlectActividad">
                                <i class="material-icons">assignment</i>
                                <span>Actividades</span>
                            </a>
                        </li>
                        <li>
                            <a href="ServlectEmpresas">
                                <i class="material-icons">group_work</i>
                                <span>Empresas</span>
                            </a>
                        </li>
                        <li>
                            <a href="ServlectServidoresCategorias">
                                <i class="material-icons">layers</i>
                                <span>Servidores - Categorias</span>
                            </a>
                        </li>
                        <li>
                            <a href="ServlectBusquedas?inicio=1">
                                <i class="material-icons">search</i>
                                <span>Busquedas</span>
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <i class="material-icons">view_module</i>
                                <span>Informe Mensual</span>
                            </a>
                        </li>
                        <li class="active">
                            <a href="">
                                <i class="material-icons">view_week</i>
                                <span>Informe Semanal</span>
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <i class="material-icons">system_update_alt</i>
                                <span>Carga Masiva de Actividades</span>
                            </a>
                        </li>
                        </aside>
                        <!-- #END# Left Sidebar -->


                        <section class="content">
                            <div class="container-fluid">
                                <div class="block-header">

                                </div>

                                <div class="row clearfix">
                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <div class="card">

                                            <form action="" method="POST">

                                                <div class="header">
                                                    <h2>
                                                        Reporte Semanal Operarios
                                                    </h2>
                                                    <br>

                                                    <div class="row">
                                                        <div class="col-xs-3">
                                                            <h4>Empresa:</h4>
                                                        </div>
                                                        <div class="col-xs-6">
                                                            <select class="form-control" id="" name="">
                                                                <option value="">Seleccionar</option>
                                                            </select>
                                                        </div>
                                                        <div class="col-xs-3">
                                                            <div align="center">
                                                                <button  style="width: 138px; height: 30px;" name="" class="btn bg-indigo waves-effect">Buscar</button>
                                                            </div>
                                                        </div>

                                                    </div>

                                            </form>    

                                        </div>
                                        <div class="body">
                                            <div class="table-responsive">
                                                <table class="table table-bordered table-striped table-hover js-basic-example dataTable">
                                                    <thead>
                                                        <tr>
                                                            <th>Empresa</th>
                                                            <th>No. Actividades</th>
                                                            <th>PE%</th>
                                                            <th>RE%</th>
                                                            <th>PA%</th>
                                                            <th>CA%</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>


                                                        <tr>
                                                            <td></td>
                                                            <td></td>
                                                            <td></td>
                                                            <td></td>
                                                            <td></td>
                                                            <td></td>
                                                        </tr>



                                                    </tbody>
                                                </table>
                                            </div>

                                            <br>
                                            <h4>
                                                Análisis Gráfico: 
                                            </h4>

                                            <canvas id="pie-chart" width="600" height="200"></canvas>
                                        </div>
                                    </div>
                                </div>
                            </div>


                            </div>
                        </section>


                        <script>
                            new Chart(document.getElementById("pie-chart"), {
                                type: 'pie',
                                data: {
                                    labels: ["Africa", "Asia", "Europe", "Latin America", "North America"],
                                    datasets: [{
                                            label: "Population (millions)",
                                            backgroundColor: ["#3e95cd", "#8e5ea2", "#3cba9f", "#e8c3b9", "#c45850"],
                                            data: [2478, 5267, 734, 784, 433]
                                        }]
                                },
                                options: {
                                    title: {
                                        display: true
                                    }
                                }
                            });

                        </script>


                        <!-- Jquery Core Js -->
                        <script src="plugins/jquery/jquery.min.js"></script>

                        <!-- Bootstrap Core Js -->
                        <script src="plugins/bootstrap/js/bootstrap.js"></script>

                        <!-- Select Plugin Js -->
                        <script src="plugins/bootstrap-select/js/bootstrap-select.js"></script>

                        <!-- Slimscroll Plugin Js -->
                        <script src="plugins/jquery-slimscroll/jquery.slimscroll.js"></script>

                        <!-- Waves Effect Plugin Js -->
                        <script src="plugins/node-waves/waves.js"></script>

                        <script src="plugins/jquery-datatable/jquery.dataTables.js"></script>
                        <script src="plugins/jquery-datatable/skin/bootstrap/js/dataTables.bootstrap.js"></script>
                        <script src="plugins/jquery-datatable/extensions/export/dataTables.buttons.min.js"></script>
                        <script src="plugins/jquery-datatable/extensions/export/buttons.flash.min.js"></script>
                        <script src="plugins/jquery-datatable/extensions/export/jszip.min.js"></script>
                        <script src="plugins/jquery-datatable/extensions/export/pdfmake.min.js"></script>
                        <script src="plugins/jquery-datatable/extensions/export/vfs_fonts.js"></script>
                        <script src="plugins/jquery-datatable/extensions/export/buttons.html5.min.js"></script>
                        <script src="plugins/jquery-datatable/extensions/export/buttons.print.min.js"></script>

                        <!-- Select Plugin Js -->
                        <script src="../../plugins/bootstrap-select/js/bootstrap-select.js"></script>

                        <!-- Custom Js -->
                        <script src="js/admin.js"></script>
                        <script src="js/pages/tables/jquery-datatable.js"></script>

                        <!-- Demo Js -->
                        <script src="js/demo.js"></script>
                        </body>

                        </html>