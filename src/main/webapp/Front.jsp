<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Calculation</title>
    <link rel="stylesheet" type="text/css" href="interestStyle.css">
    <link rel="stylesheet" href="css/interestStyle.css?<%= System.currentTimeMillis() %>">
    
    <!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    
    
</head>
<body>
    <section class="blog">
   
        <div class="row">
        <div class="col-12 text-center seth">
            <h1>|| हमारे सेठ श्री सांवलिया सेठ ||</h1>
        </div>
    </div>




<div class="row justify-content-center">
    <div class="col-lg-4 col-md-6 col-sm-10 formi">
     

    <form  action="info" method="post">

        <label class="shift" for="amount">राशि</label><br>
        <input class="shifti" type="number" name="amount"  id="amount" required><br>

        <label class="shift" for="startd">प्रारंभ तिथि</label><br>
        <input  class="shifti" type="date" name="startd" id="startd" required><br>

        <label class="shift" for="endd">समाप्ति तिथि</label><br>
        <input  class="shifti" type="date" name="endd" id="endd" required><br>

        <label class="shift" for="interest">ब्याज की दर (%)</label><br>
        <input  class="shifti" type="number" name="interest" step="0.01" id="interest" required><br>
        
        <label class="shift" for="type">ब्याज का प्रकार </label><br>
        <select  class="shifti" name="type"  id="type" >
        <option value="compound">चक्रवृद्धि</option>
        <option value="simple">साधारण</option>
        </select>
        <br>
        

        <button class="button">Calculate</button>
        

    </form>
    </div>
    </div>
    <script>
    let today = new Date().toISOString().split('T')[0];
    document.getElementById("endd").value = today;
</script>
    </section>
    
    
   

</body>
</html>