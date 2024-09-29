<script>
fetch('https://api.ipify.org?format=json')
  .then(response => response.json())
  .then(data => {
    console.log(data.ip); // This will show the IP in the console.
    
    // Send the IP to your server for logging
    fetch('log_ip.php', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({ ip: data.ip }),
    });
  });
</script>
