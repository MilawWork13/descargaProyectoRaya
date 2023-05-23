<%@ page contentType="text/html; charset=UTF-8" %>

    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Play Mate</title>
        <link href="newIndexStyle.css" rel="stylesheet" type="text/css" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/a9cd6825c3.js" crossorigin="anonymous"></script>
    </head>

    <body>
        <section>
            <nav class="navbar navbar-light bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand me-5" href="#">
                        <img src="generalImages/logoPlayMate.png" alt="" width="100" height="100"
                            class="d-inline-block">
                        <span class="fs-5 fw-bold">Play</span> <span class="fw-bold fs-5"
                            style="color: hsl(197, 100%, 50%)">Mate</span>
                    </a>
                    <div class="justify-content-center">
                        <ul class="nav nav-pills">
                            <li class="nav-item dropdown me-5">
                                <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button"
                                    aria-expanded="false"><i class="fa-solid fa-user fa-xl" style="color: #005eff;"></i>
                                    Área de
                                    usuario</a>
                                <ul class="dropdown-menu">
                                    <li><a class="dropdown-item" href="player/registro/registro.jsp">Registrar Usuario</a></li>
                                    <li><a class="dropdown-item" href="player/modificar/modificar.jsp">Modificar contraseña</a></li>
                                    <li>
                                        <hr class="dropdown-divider">
                                    </li>
                                    <li><a class="dropdown-item" href="player/borrar/borrar.jsp">Eliminar usuario</a></li>
                                </ul>
                            </li>
                            <li class="nav-item dropdown me-5">
                                <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button"
                                    aria-expanded="false"><i class="fa-solid fa-gamepad fa-xl"
                                        style="color: #005eff;"></i> Juegos</a>
                                <ul class="dropdown-menu">
                                    <li><a class="dropdown-item" href="sieteMedio/setup/setup.jsp">Siete y Medio</a></li>
                                    <li><a class="dropdown-item" href="cuatroRaya/juego/juego.jsp">Cuatro en raya</a></li>
                                </ul>
                            </li>
                            <li class="nav-item dropdown me-5">
                                <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button"
                                    aria-expanded="false"><i class="fa-solid fa-magnifying-glass"
                                        style="color: #005eff;"></i> Buscar partidos</a>
                                <ul class="dropdown-menu">
                                    <li><a class="dropdown-item" href="sieteMedio/busqueda/busqueda.jsp">Partidas de Siete y medio</a></li>
                                    <li><a class="dropdown-item" href="cuatroRaya/busqueda/busqueda.jsp">Partidas de Cuatro en raya</a></li>
                                    <li>
                                        <hr class="dropdown-divider">
                                    </li>
                                    <li><a class="dropdown-item" href="ranking/ranking.jsp">Ranking de jugadores</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div> <!-- Close the navbar-collapse div here -->
            </nav>
        </section>
        <section>

        </section>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
            integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
            crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"
            integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V"
            crossorigin="anonymous"></script>
    </body>

    </html>