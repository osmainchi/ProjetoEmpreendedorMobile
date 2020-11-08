<?php
require "conn.php";
$telefone = $_POST["celular"];
//$telefone = "11987744587";
$query = "select * from Motorista where NumeroCelular like '$telefone' and Ativo like 'Y'";
$result = mysqli_query($conn, $query);

while($row = mysqli_fetch_assoc($result)){
	echo $row['ID'];

}
?>