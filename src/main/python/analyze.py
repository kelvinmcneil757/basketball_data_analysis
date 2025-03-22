import sys

def analyze_player(player_name):
    # Dummy data analysis
    return f"Score for {player_name}: {len(player_name) * 10}"

if __name__ == "__main__":
    player_name = sys.argv[1]
    result = analyze_player(player_name)
    print(result)
