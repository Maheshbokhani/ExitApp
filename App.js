import {
  StyleSheet,
  View,
  Text,
  TouchableOpacity
} from 'react-native';
import React, { Component } from 'react';
import ExitApp from './NativeModule'

export default class App extends Component {

  _onPress = () => {
    ExitApp.exit()
  }

  render() {
    return (
      <View style={styles.container}>
        <TouchableOpacity style={styles.button}
          onPress={this._onPress}>
          <Text style={styles.buttonText}>Exit</Text>
        </TouchableOpacity>
      </View>
    )
  }
}
const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'white',
    justifyContent: "center",
    alignItems: 'center'
  },
  button: {
    width: '30%',
    height: 50,
    justifyContent: "center",
    alignItems: 'center',
    backgroundColor: "lightgrey"
  },
  buttonText: {
    fontSize: 16,
    fontWeight: 'bold'
  }
});
