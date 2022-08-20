<!DOCTYPE html>
<html lang="zxx">
<head>
    <title>Distinct Multipurpose Bootstrap Responsive website Template | Home :: w3layouts</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="utf-8" />
    <meta name="keywords" content="Distinct Responsive web template, Bootstrap Web Templates,Android Compatible web template, 
	SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
    <script>
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
    <link href="css9/bootstrap.css" type="text/css" rel="stylesheet" media="all">
    <link href="css9/style.css" type="text/css" rel="stylesheet" media="all">
    <link href="css9/fontawesome-all.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Alegreya+Sans:100,100i,300,300i,400,400i,500,500i,700,700i,800,800i,900,900i"
        rel="stylesheet">
</head>
<body>
    <div class="sidenav">
        <header>
            <nav class="navbar navbar-expand-lg navbar-light bg-gradient-secondary pt-3 flex-column">

                <h1>
                    <a class="navbar-brand" href="">Admin
                    </a>
                </h1>
                <button class="navbar-toggler ml-lg-auto mt-3" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav text-center flex-column">
                    
                        <li class="nav-item">
                            <a class="nav-link" href="Adinbox1.jsp">Inbox</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Ownerview.jsp">Data Owner details</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Userview.jsp">Data User details</a>
                        </li>
                            
                        <li class="nav-item">
                            <a class="nav-link" href="Logout.jsp">Logout</a>
                        </li>
                    </ul>
                </div>

            </nav>
        </header>
    </div>
    <div class="main">
        <div class="banner-text-w3ls">
            <div class="container">
                <div class="mx-auto">
                    <h2>Dual protection</h2>
                </div>
            </div>
        </div>
    </div>
    <script src="js9/jquery-2.2.3.min.js"></script>
    <script src="js9/easing.js "></script>
    <script>
        jQuery(document).ready(function ($) {
            $(".scroll ").click(function (event) {
                event.preventDefault();

                $('html,body').animate({
                    scrollTop: $(this.hash).offset().top
                }, 1000);
            });
        });
    </script>
    <script src="js9/move-top.js"></script>
    <script>
        $(document).ready(function () {
            /*
             var defaults = {
                 containerID: 'toTop', // fading element id
                 containerHoverID: 'toTopHover', // fading element hover id
                 scrollSpeed: 1200,
                 easingType: 'linear' 
             };
             */

            $().UItoTop({
                easingType: 'easeOutQuart'
            });
        })
        jQuery(document).ready(function ($) {
            $(".scroll ").click(function (event) {
                event.preventDefault();

                $('html,body').animate({
                    scrollTop: $(this.hash).offset().top
                }, 1000);
            });
        });
    </script>
    <script src="js9/SmoothScroll.min.js "></script>
    <script src="js9/bootstrap.js"></script>
</body>
</html>