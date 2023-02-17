 <div class="container">
   <!-- <link rel="stylesheet" href="one4copy.css">  -->
  <div class="row">
    <div class="col-md-6">
      <div class="card">
        <form action="MainServlet" method="post" class="box">
           <h1>Faculty Input</h1>
            <p class="text-muted">Enter Faculty Details </p>
            <!-- <input type="number" name="SubCode" id="SubCode" placeholder="Subject Code" required> -->



        <script src=
    "https://code.jquery.com/jquery-3.5.1.slim.min.js">
        </script>
        <script src=
    "https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js">
        </script>
        <link rel="stylesheet" href=
    "https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <script src=
    "https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js">
        </script>
        <link rel="stylesheet" href=
    "https://cdn.jsdelivr.net/npm/bootstrap-select@1.13.14/dist/css/bootstrap-select.min.css">
        <script src=
    "https://cdn.jsdelivr.net/npm/bootstrap-select@1.13.14/dist/js/bootstrap-select.min.js">
        </script>
         <style>
            .bootstrap-select img {
                width: 16px;
            }
            
            
           
body {
    margin: 0;
    padding: 0;
    font-family: sans-serif;
    /* background: linear-gradient(to right, #b92b27, #1565c0) */
    /* background-image: linear-gradient(to right, hotpink, lightpink); */
    /* background-image: linear-gradient(75deg, #3800fd -5%, #ff0092 40%, #ff6fb1 65%, #ff4740 90%); */
    /* background-image: linear-gradient(-45deg, #4481eb 0%, #04befe 100%);
    background-size: 50% auto; */
   background:rgba(241, 120, 72, 0.77);
  /* background-image: url("https://media.giphy.com/media/U3qYN8S0j3bpK/giphy.gif"); */
  
}

.bootstrap-select img {
                width: 16px;
            }
.card{
    margin-bottom:60px;
    border:none;
}

p{
  color:blue;
}
.box {
    width: 400px;
    height:500px;
    padding: 40px;
    position: absolute;
    top: 60%;
    left: 60%;
    background: #191919;
      box-shadow: 0 0 35px #080808;
    text-align: center;
    transition: 0.25s;
    margin-top: 50px

}

.box input[type="number"],
.box input[type="name"],
.box input[type="number"] {
    border: 0;
    background: none;
    display: block;
    margin: 20px auto;
    text-align: center;
    border: 2px solid #3498db;
    padding: 10px 10px;
    width: 250px;
    outline: none;
    color: white;
    border-radius: 24px;
    transition: 0.25s
}

.box h1 {
    color: white;
    text-transform: uppercase;
    font-weight: 500
}

.box input[type="number"]:focus,
.box input[type="name"]:focus,
.box input[type="number"]:focus{
    width: 300px;
    border-color: #2ecc71
}

.box input[type="submit"] {
    border: 0;
    background: none;
    display: block;
    margin: 20px auto;
    text-align: center;
    border: 2px solid #2ecc71;
    padding: 14px 40px;
    outline: none;
    color: white;
    border-radius: 24px;
    transition: 0.25s;
    cursor: pointer
}

.box input[type="submit"]:hover {
    background: #2ecc71
}

.forgot {
    text-decoration: underline
}

            
        </style> 

        <select class="selectpicker">
            <optgroup label=
                "<img src='https://openmoji.org/data/color/svg/1F600.svg'> LAB">
                      <option selected="selected">LAB/THEORY</option>
                <option>5011</option>
                <option>5022</option>
                <option>5033</option>
            </optgroup>
            <optgroup label=
                "<img src='https://openmoji.org/data/color/svg/1F923.svg'> THEORY">
                <option>501</option>
                <option>502</option>
                <option>503</option>
                <option>504</option>
                <option>505</option>
            </optgroup>
        </select>
        <script>
            $('.selectpicker').on('shown.bs.select', function () {
                $('.bootstrap-select .dropdown-header').each(function () {
                    if ((this.dataset.unescaped || '1') == '1') {
                        let element = $(this);
                        element.html(element.text());
                        element.attr('data-unescaped', '0');
                    }
                })
            })
        </script>


             <input type="name" name="Facultyname" id="Facultyname" placeholder="Faculty Name" required>
             <input type="number" name="Hour" id="Hour" placeholder="Hour" required>
             <input type="number" name="number" id="number" placeholder="Contact number" required>

              <input type="submit" name="" value="submit">
              <div class="col-md-12">
                </div>
              </form>
            </div>
          </div>
        </div>
      
      
</div>
