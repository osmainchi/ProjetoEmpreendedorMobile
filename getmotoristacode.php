<?php
require "conn.php";
//$telefone = $_POST["celular"];
//$ID = "1";
$ID = $_POST["ID"];
$query = "select * from Motorista where ID like '$ID' ";
$result = mysqli_query($conn, $query);

while($row = mysqli_fetch_assoc($result)){
	echo $row['CodigoCelular'];

}
?>