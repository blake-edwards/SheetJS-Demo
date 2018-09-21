<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.dataaccessobject.blake.ResourceAllocationDAO" %>
<%@ page import="com.dataaccessobject.blake.ResourceAllocationRow" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>

<head>
<script lang="javascript" src="./scripts/FileSaver.js"></script>
<script lang="javascript" src="https://unpkg.com/xlsx@0.13.3/dist/xlsx.full.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>SheetJS Testing</title>
<style>
	table {
	    font-family: arial, sans-serif;
	    border-collapse: collapse;
	    width: 100%;
	}
	
	td, th {
	    border: 1px solid #dddddd;
	    text-align: left;
	    padding: 8px;
	}
	
	tr:nth-child(even) {
	    background-color: #dddddd;
	}
	.container {
	  margin: 30px;
	  border-radius: 15px;
	  text-align: center;
	}
</style>
</head>

<body>
	<div>
		<%@include file="header.jsp" %>
		<!-- HTML table -->
		<div class="container">
			<table id="mytable">
			  <tr>
			    <th>Company</th>
			    <th>Contact</th>
			    <th>Country</th>
			  </tr>
			  <tr>
			    <td>Alfreds Futterkiste</td>
			    <td>Maria Anders</td>
			    <td>Germany</td>
			  </tr>
			  <tr>
			    <td>Centro comercial Moctezuma</td>
			    <td>Francisco Chang</td>
			    <td>Mexico</td>
			  </tr>
			  <tr>
			    <td>Ernst Handel</td>
			    <td>Roland Mendel</td>
			    <td>Austria</td>
			  </tr>
			  <tr>
			    <td>Island Trading</td>
			    <td>Helen Bennett</td>
			    <td>UK</td>
			  </tr>
			  <tr>
			    <td>Laughing Bacchus Winecellars</td>
			    <td>Yoshi Tannamuri</td>
			    <td>Canada</td>
			  </tr>
			  <tr>
			    <td>Magazzini Alimentari Riuniti</td>
			    <td>Giovanni Rovelli</td>
			    <td>Italy</td>
			  </tr>
			</table>
			<!-- button: toExcel() -->
			<button id="download-excel-btn" style="margin:30px;">Download Table</button>
		</div>
		
	</div>
	
	<script>
		var wb = XLSX.utils.table_to_book(document.getElementById('mytable'), {sheet:"Sheet JS"});
		
		// styling on wb 
		/*
		var worksheet = wb.Sheets["Sheet JS"];
		var cell = worksheet["A1"];
		var cell_value = cell.v;
		var cell_style = cell.s;
		console.log(cell_value);
		console.log(cell_style);
		cell.s =  {font:{sz:"30"}};
		cell_style = cell.s;
		console.log(cell_style);
		*/
		
	    var wbout = XLSX.write(wb, {bookType:'xlsx', bookSST:true, type: 'binary'});
	    function s2ab(s) {
	                    var buf = new ArrayBuffer(s.length);
	                    var view = new Uint8Array(buf);
	                    for (var i=0; i<s.length; i++) view[i] = s.charCodeAt(i) & 0xFF;
	                    return buf;
	    }
	    $("#download-excel-btn").click(function(){
	    	saveAs(new Blob([s2ab(wbout)],{type:"application/octet-stream"}), 'mytable.xlsx');
	    });
	</script>
	
</body>
</html>